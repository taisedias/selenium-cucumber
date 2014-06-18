package demo.activeadmin.info.resources.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;
    private static int DEFAULT_WAIT_TIME = 5;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void createFirefoxDriver() {
        driver = new FirefoxDriver();
        setDefaultDriverTimeout();
    }

    public static void shutdownDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private static void setDefaultDriverTimeout() {
        driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
    }

    public static void get(String url) {
        driver.get(url);
    }

    public static WebElement waitForElement(By by) {
        return (new WebDriverWait(driver, DEFAULT_WAIT_TIME)).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static List<WebElement> waitForAllElements(By by) {
        return (new WebDriverWait(driver, DEFAULT_WAIT_TIME)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

}
