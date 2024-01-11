package NewPage;

import commons.AbstractPage2;
import Interfaces2.HomePageInter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Home extends AbstractPage2{
    WebDriver driver;
    public Home(WebDriver driver2) {
        driver = driver2;
    }
    public void verifyHomePageIsDisplayedProperty() {
        Assert.assertTrue(driver.findElement(By.xpath(HomePageInter.h4)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(HomePageInter.NAME)).isDisplayed());
    }

    public void clickSales() {
        clickToElement(driver, HomePageInter.SALES);
    }
    public void clickInvoices() {clickToElement(driver, HomePageInter.INVOICES);}
}
