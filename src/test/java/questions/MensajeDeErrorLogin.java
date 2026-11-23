package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.LoginPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeDeErrorLogin implements Question<String> {

    public static MensajeDeErrorLogin esVisibleYContieneTexto() {
        return new MensajeDeErrorLogin();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.LOGIN_ERROR_MESSAGE, isVisible()).forNoMoreThan(10).seconds()
        );
        return Text.of(LoginPage.LOGIN_ERROR_MESSAGE).answeredBy(actor);
    }
}