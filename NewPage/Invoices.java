package NewPage;

import commons.AbstractPage2;
import Interfaces2.HomePageInter;
import Interfaces2.InvoicesPageInter;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class Invoices extends AbstractPage2 {
    WebDriver driver;
    public Invoices (WebDriver driver3) {
        driver = driver3;
    }
    public void addNewPayment() {
        clickToElement(driver, InvoicesPageInter.ADDPAYMENT);
    }
    public void invoiceTitle() {
        clickToElement(driver, InvoicesPageInter.INVOICE);
        clickToElement(driver, InvoicesPageInter.CLICKiNVOICE);
    }
    public void choosePaymentMethod() {
        clickToElement(driver, InvoicesPageInter.PAYMENTMETHOD);
        clickToElement(driver, InvoicesPageInter.CLICKPAYMENTMETHOD);
    }
    public void inputPaymentDate(String date) {
        sendKeyToElement(driver, InvoicesPageInter.PAYMENTDATE, date);
        pressEnter(driver, InvoicesPageInter.PAYMENTDATE);
    }
    public void inputPaymentAmount(String amount) {
        clickToElement(driver, InvoicesPageInter.INVOICEPAYMENTAMOUNT);
        clearValue(driver, InvoicesPageInter.INVOICEPAYMENTAMOUNT);
        sendKeyToElement(driver, InvoicesPageInter.INVOICEPAYMENTAMOUNT,amount);
    }
    public void inputNote(String note) {
        clickToElement(driver, InvoicesPageInter.NOTE);
        sendKeyToElement(driver, InvoicesPageInter.CLICKNOTE, note);
    }
    public void clickSaveButton() {
        clickToElement(driver, InvoicesPageInter.SUBMIT);
    }
    public void waitforAddPaymentisclickable() {
        waitForElementClickable(driver, By.xpath(InvoicesPageInter.ADDPAYMENT));
    }

}
