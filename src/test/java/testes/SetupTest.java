package testes;

import org.junit.Test;
import pageObjects.AuthenticationPage;
import pageObjects.CreateAccount;
import pageObjects.HomePage;
import pageObjects.MyAcoountPage;
import utils.Brouser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests {


    @Test
    public void testOpenBrowserAndLoadPage() {
        assertTrue(Brouser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrirmos o navegador e carregamos a url!");
    }

    @Test
    public void testCreateEmailAccont() {
        HomePage home = new HomePage();
        AuthenticationPage authePage = new AuthenticationPage();

        home.clickBtSignIn();
        System.out.println("Direcionado a pagina de Sign In");


        authePage.fillCreaEmail();
        System.out.println("colocou email para cadastro");
        assertTrue(authePage.isAuthenticPage());
        System.out.println("Validou pagina de cadastro");

        authePage.clickBtCreateEmail();
        System.out.println("Clicou no botao create Account");
    }

    @Test
    public void testCreateAccount() {
        testCreateEmailAccont();

        CreateAccount creatAct = new CreateAccount();

        MyAcoountPage myAccount = new MyAcoountPage();

        creatAct.fillaccouth();

        assertTrue(creatAct.isCreateAcoountPage());
        System.out.println("Validou a Create Page");

        creatAct.clickSubmitAccount();
        System.out.println("clicou em criar a conta");

        myAccount.isMyAccountPage();
        System.out.println("validou a my account page");
    }
}
