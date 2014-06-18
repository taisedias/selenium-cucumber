package demo.activeadmin.info.resources.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static demo.activeadmin.info.resources.support.Driver.waitForAllElements;
import static demo.activeadmin.info.resources.support.Driver.waitForElement;

public class DashboardPage {
    private static final By MESSAGE = By.id("flash_notice");
    private static final By WELCOME_MESSAGE = By.id("auth");

    public static boolean displaysMessage(String message) {
        boolean isDisplayed = false;
        List<WebElement> elements = waitForAllElements(MESSAGE);
        for (WebElement element : elements) {
            isDisplayed = isDisplayed || message.equals(element.getText());
        }
        return isDisplayed;
    }

    public static boolean displaysWelcomeMessage(String message) {
        String actualMessage = waitForElement(WELCOME_MESSAGE).getText();
        return actualMessage.contains(message);
    }
}
