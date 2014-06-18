package demo.activeadmin.info.resources.steps;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import demo.activeadmin.info.resources.pages.ProductsPage;

public class AdminStepDefinitions {

    @Quando("^acesso a funcionalidade de produtos$")
    public void acesso_a_funcionalidade_de_produtos() throws Throwable {
        ProductsPage.access();
    }

    @Quando("^crio o produto:$")
    public void crio_o_produto(DataTable arg1) throws Throwable {

    }

    @Então("^vejo a mensagem: \"([^\"]*)\"$")
    public void vejo_a_mensagem(String arg1) throws Throwable {
    }

    @Então("^os dados do novo produto são listados corretamente$")
    public void os_dados_do_novo_produto_são_listados_corretamente() throws Throwable {
    }

}
