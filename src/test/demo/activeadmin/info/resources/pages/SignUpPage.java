package demo.activeadmin.info.resources.pages;

import demo.activeadmin.info.resources.support.domain.User;
import org.openqa.selenium.By;

import static demo.activeadmin.info.resources.support.Driver.get;
import static demo.activeadmin.info.resources.support.Driver.waitForElement;

public class SignUpPage {
    private static String SIGN_UP_URL = HomePage.HOME_URL + "/signup";

    private static By USERNAME = By.id("user_username");
    private static By EMAIL = By.id("user_email");
    private static By PASSWORD = By.id("user_password");
    private static By CONFIRM_PASSWORD = By.id("user_password_confirmation");
    private static By SIGN_UP = By.id("user_submit");

    public static void access() {
        get(SIGN_UP_URL);
    }

    public static void signUp(User user) {
        waitForElement(USERNAME).sendKeys(user.getUsername());
        waitForElement(EMAIL).sendKeys(user.getEmail());
        waitForElement(PASSWORD).sendKeys(user.getPassword());
        waitForElement(CONFIRM_PASSWORD).sendKeys(user.getConfirmPassword());
        waitForElement(SIGN_UP).click();
    }

}
