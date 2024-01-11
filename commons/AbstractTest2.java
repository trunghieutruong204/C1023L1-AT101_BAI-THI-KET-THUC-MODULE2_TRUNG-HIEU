package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AbstractTest2 {
    WebDriver driver;

    public WebDriver openMultiBrowsers(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Tester\\Trung-Hieu_POM\\C1023L1_Trung-Hieu_POM\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Tester\\Trung-Hieu_POM\\C1023L1_Trung-Hieu_POM\\resources\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chromeheadless")){
            System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            options.addArguments("window-size=1400,800");
            driver = new ChromeDriver(options);
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public String randomEmail() {
        Random random = new Random();
        int number = random.nextInt(999999);
        String randomEmail = "automation" + number + "@gmail.com";
        return randomEmail;
    }
}

