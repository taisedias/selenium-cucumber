package demo.activeadmin.info.resources.pages;

import demo.activeadmin.info.resources.support.domain.User;
import org.openqa.selenium.By;

import static demo.activeadmin.info.resources.support.Driver.get;
import static demo.activeadmin.info.resources.support.Driver.waitForElement;

public class LoginPage {
    private static final String LOGIN_URL = HomePage.HOME_URL + "/login";

    private static final By USERNAME = By.id("login");
    private static final By PASSWORD = By.id("password");
    private static final By SUBMIT_BUTTON = By.name("commit");

    public static void access() {
        get(LOGIN_URL);
    }

    public static void login(User user) {
        waitForElement(USERNAME).sendKeys(user.getEmail());
        waitForElement(PASSWORD).sendKeys(user.getPassword());
        waitForElement(SUBMIT_BUTTON).click();
    }

}
