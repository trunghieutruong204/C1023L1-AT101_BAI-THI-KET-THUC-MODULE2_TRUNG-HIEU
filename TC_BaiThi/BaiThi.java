package TC_BaiThi;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest2;
import NewPage.Home;
import NewPage.SignIn;
import NewPage.Invoices;

public class BaiThi extends AbstractTest2 {
    WebDriver driver;
    String url = "https://rise.fairsketch.com/signin";
    String username, password;

    @Parameters("browser")
    @BeforeClass
    public void BeforeClass(String browser) {
        driver = openMultiBrowsers(browser);
    }

    @Test
    public void TC01_SignIn() {
        System.out.println("Open SignIn Page");
        SignIn = new SignIn(driver);
        SignIn.openSigninPage(url);

        System.out.println("Clear Username and Password");
        SignIn.clearUsernameAndPassword();

        System.out.println("Input Username and Password");
        SignIn.inputUserNameAndPassword("admin@demo.com", "riseDemo");

        System.out.println("Click Sign In");
        SignIn.clickSignin();
    }
    @Test
    public void TC02_GoToTaskPage() {
        System.out.println("Verify Homepage is displayed correctly");
        Home = new Home(driver);
        Home.verifyHomePageIsDisplayedProperty();

        System.out.println("Click Sales");
        Home.clickSales();

        System.out.println("Go to Invoices Page");
        Home.clickInvoices();
    }
    @Test
    public void TC03_AddNewPayment(){
        System.out.println("Add New Payment #1");
        Invoices = new Invoices(driver);
        Invoices.addNewPayment();

        System.out.println("Input Invoice Title #1");
        Invoices.invoiceTitle();

        System.out.println("Add payment Method #1");
        Invoices.choosePaymentMethod();

        System.out.println("Input Payment Date #1");
        Invoices.inputPaymentDate("11-01-2024");

        System.out.println("Input Amount #1");
        Invoices.inputPaymentAmount("150");

        System.out.println("Input Description #1");
        Invoices.inputNote("Buy TWICE album");

        System.out.println("Click Save button #1");
        Invoices.clickSaveButton();

        System.out.println("Wait for Add Payment is Clickable");
        Invoices.waitforAddPaymentisclickable();

        System.out.println("Add New Payment #2");
        Invoices.addNewPayment();

        System.out.println("Input Invoice Title #2");
        Invoices.invoiceTitle();

        System.out.println("Add payment Method #2");
        Invoices.choosePaymentMethod();

        System.out.println("Input Payment Date #2");
        Invoices.inputPaymentDate("12-01-2024");

        System.out.println("Input Amount #2");
        Invoices.inputPaymentAmount("120");

        System.out.println("Input Description #2");
        Invoices.inputNote("Buy NMIXX album");

        System.out.println("Click Save button #2");
        Invoices.clickSaveButton();

        System.out.println("Wait for Add Payment is Clickable");
        Invoices.waitforAddPaymentisclickable();

        System.out.println("Add New Payment #3");
        Invoices.addNewPayment();

        System.out.println("Input Invoice Title #3");
        Invoices.invoiceTitle();

        System.out.println("Add payment Method #3");
        Invoices.choosePaymentMethod();

        System.out.println("Input Payment Date #3");
        Invoices.inputPaymentDate("14-01-2024");

        System.out.println("Input Amount #3");
        Invoices.inputPaymentAmount("140");

        System.out.println("Input Description #3");
        Invoices.inputNote("Buy ITZY album");

        System.out.println("Click Save button #3");
        Invoices.clickSaveButton();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
    private SignIn SignIn;
    private Home Home;
    private Invoices Invoices;
}