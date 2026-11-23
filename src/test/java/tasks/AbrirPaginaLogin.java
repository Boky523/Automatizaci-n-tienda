package tasks;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.util.EnvironmentVariables;
import ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaLogin implements Task {
    private EnvironmentVariables environmentVariables;

    public static AbrirPaginaLogin enLaTienda() {
        return instrumented(AbrirPaginaLogin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String urlBase = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("webdriver.base.url");

        actor.attemptsTo(
                Open.url(urlBase),
                Click.on(LoginPage.SIGN_IN_NAV_LINK)
        );
    }
}