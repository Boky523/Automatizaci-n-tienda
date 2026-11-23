package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import questions.MensajeDeErrorLogin;
import tasks.AbrirPaginaLogin;
import tasks.IniciarSesion;
import ui.LoginPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        //esta linea prepara el escenario limpio dentro de onStage
        OnStage.theActorCalled("Comprador");
        //crea un actor llamado comprador
    }



    @Given("que el usuario accede a la página de inicio de sesión")
    public void queElUsuarioAccedeALaPaginaDeInicioDeSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AbrirPaginaLogin.enLaTienda()
        );
    }

    @When("ingresa el correo {string} y la contraseña {string}")
    public void ingresaElCorreoYLaContrasena(String correo, String contrasena) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conCredenciales(correo, contrasena)
        );
    }

    @Then("el sistema debería mostrar un mensaje de error de inicio de sesión")
    public void elSistemaDeberiaMostrarUnMensajeDeErrorDeInicioDeSesion() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        WebElementQuestion.the(LoginPage.LOGIN_ERROR_MESSAGE),
                        WebElementStateMatchers.isVisible()
                )
        );
    }
    @After
    public void tearDown() {
        OnStage.drawTheCurtain();
    }
}