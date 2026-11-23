package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrARegistro implements Task {

    public static IrARegistro ahora() {
        return instrumented(IrARegistro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.ENLACE_REGISTRARSE)
        );
    }
}