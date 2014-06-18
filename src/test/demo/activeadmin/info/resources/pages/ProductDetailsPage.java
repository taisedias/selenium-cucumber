package demo.activeadmin.info.resources.pages;

import demo.activeadmin.info.resources.support.domain.Product;
import org.openqa.selenium.By;

import static demo.activeadmin.info.resources.support.Driver.getDriver;
import static demo.activeadmin.info.resources.support.Driver.waitForElement;

public class ProductDetailsPage {
    private static final By MESSAGE = By.cssSelector("div.flash");

    public static boolean displaysMessage(String output) {
        return output.equals(waitForElement(MESSAGE).getText());
    }

    public static boolean contains(Product product) {
        return getDriver().getPageSource().contains(product.getTitle()) &&
                getDriver().getPageSource().contains(product.getDescription()) &&
                getDriver().getPageSource().contains(product.getPrice()) &&
                getDriver().getPageSource().contains(product.getImage());
    }
}
