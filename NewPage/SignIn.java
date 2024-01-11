package NewPage;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage2;
import interfaces2.SignInPageInter;

public class SignIn extends AbstractPage2 {
    WebDriver driver;

    public SignIn(WebDriver driver1) {
        driver = driver1;
    }
    public void openSigninPage (String url) {
        openUrl(driver, url);
    }

    public void clearUsernameAndPassword() {
        clearValue(driver, SignInPageInter.USER_NAME);
        clearValue(driver, SignInPageInter.PASSWORD);
    }
    public void inputUserNameAndPassword(String username, String password) {
        sendKeyToElement(driver, SignInPageInter.USER_NAME, username);
        sendKeyToElement(driver, SignInPageInter.PASSWORD, password);
    }

    public void clickSignin() {
        clickToElement(driver, SignInPageInter.SUBMIT);
    }
}
