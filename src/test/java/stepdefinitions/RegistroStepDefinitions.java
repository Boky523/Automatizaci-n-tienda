package stepdefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.AbrirPaginaLogin;
import tasks.IrARegistro;
import tasks.RegistroUsuario;
import ui.PaginaRegistro;
import java.util.Map;



public class RegistroStepDefinitions {


    @Given("que el usuario accede a la página de inicio de sesión para registrase")
    public void queElUsuarioAccedeALaPaginaDeInicioDeSesion() {
        OnStage.theActorCalled("Usuario").attemptsTo(
                AbrirPaginaLogin.enLaTienda(),
                IrARegistro.ahora()
        );
    }

    @When("completa el formulario de registro con los siguientes datos:")
    public void CompletarFormularioRegistro(DataTable dataTable) {


        Map<String, String> datos = dataTable.asMap(String.class, String.class);

        String nombre = datos.get("nombre");
        String apellido = datos.get("apellido");
        String fechaNacimiento = datos.get("fechaNacimiento");
        String codigoPais = datos.get("codigoPais");
        String codigoPostal = datos.get("codigoPostal");
        String numeroCasa = datos.get("numeroCasa");
        String calle = datos.get("calle");
        String ciudad = datos.get("ciudad");
        String estado = datos.get("estado");
        String telefono = datos.get("telefono");
        String correo = datos.get("correo");
        String contrasena = datos.get("contrasena");

        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroUsuario.conDatos(
                        nombre, apellido, fechaNacimiento,
                        codigoPais, codigoPostal, numeroCasa,
                        calle, ciudad, estado, telefono,
                        correo, contrasena
                )
        );
    }

    @Then("el sistema debería mostrar pantalla de ingreso")
    public void elSistemaDeberiaMostrarUnMensajeDeErrorDeInicioDeSesion() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        WebElementQuestion.the(PaginaRegistro.Registro_AlertaExitosa),
                        WebElementStateMatchers.isVisible()
                )
        );
    }

}
