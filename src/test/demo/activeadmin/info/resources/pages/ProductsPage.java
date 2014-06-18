package demo.activeadmin.info.resources.pages;

import demo.activeadmin.info.resources.support.domain.Product;
import org.openqa.selenium.By;

import static demo.activeadmin.info.resources.support.Driver.get;
import static demo.activeadmin.info.resources.support.Driver.waitForElement;

public class ProductsPage {

    private static final String PRODUCTS_URL = HomePage.HOME_URL + "/admin/products";

    private static final By NEW_PRODUCT_BUTTON = By.linkText("New Product");

    private static final By TITLE = By.id("product_title");
    private static final By DESCRIPTION = By.id("product_description");
    private static final By PRICE = By.id("product_price");
    private static final By IMAGE = By.id("product_image_file_name");
    private static final By CREATE_PRODUCT_BUTTON = By.id("product_submit");

    public static void access() {
        get(PRODUCTS_URL);
    }

    public static void chooseCreate() {
        waitForElement(NEW_PRODUCT_BUTTON).click();
    }

    public static void create(Product product) {
        waitForElement(TITLE).sendKeys(product.getTitle());
        waitForElement(DESCRIPTION).sendKeys(product.getDescription());
        waitForElement(PRICE).sendKeys(product.getPrice());
        waitForElement(IMAGE).sendKeys(product.getImage());
        waitForElement(CREATE_PRODUCT_BUTTON).click();
    }

}
