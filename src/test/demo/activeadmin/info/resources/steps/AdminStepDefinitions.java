package demo.activeadmin.info.resources.steps;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import demo.activeadmin.info.resources.pages.ProductDetailsPage;
import demo.activeadmin.info.resources.pages.ProductsPage;
import demo.activeadmin.info.resources.support.domain.Product;

import static org.junit.Assert.assertTrue;

public class AdminStepDefinitions {
    private Product product;

    @Quando("^acesso a funcionalidade de produtos$")
    public void acesso_a_funcionalidade_de_produtos() throws Throwable {
        ProductsPage.access();
    }

    @Quando("^crio o produto:$")
    public void crio_o_produto(DataTable inputs) throws Throwable {
        product = (Product) inputs.asList(Product.class).get(0);
        ProductsPage.chooseCreate();
        ProductsPage.create(product);
    }

    @Então("^vejo a mensagem: \"([^\"]*)\"$")
    public void vejo_a_mensagem(String output) throws Throwable {
        assertTrue(ProductDetailsPage.displaysMessage(output));
    }

    @Então("^os dados do novo produto são listados corretamente$")
    public void os_dados_do_novo_produto_são_listados_corretamente() throws Throwable {
        assertTrue(ProductDetailsPage.contains(product));
    }

}
