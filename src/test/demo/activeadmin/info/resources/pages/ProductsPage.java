package demo.activeadmin.info.resources.pages;

import static demo.activeadmin.info.resources.support.Driver.get;

public class ProductsPage {

    private static final String PRODUCTS_URL = HomePage.HOME_URL + "/admin/products";

    public static void access() {
        get(PRODUCTS_URL);
    }
}
