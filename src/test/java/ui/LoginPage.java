package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target SIGN_IN_NAV_LINK = Target.the("enlace de navegación Sign in")
            .located(By.cssSelector("[data-test='nav-sign-in']"));

    public static final Target EMAIL_INPUT = Target.the("campo de correo electrónico")
            .located(By.id("email"));

    public static final Target PASSWORD_INPUT = Target.the("campo de contraseña")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("botón Login")
            .located(By.cssSelector("[data-test='login-submit']"));

    public static final Target LOGIN_ERROR_MESSAGE = Target.the("mensaje de error de inicio de sesión")
            .locatedBy("[data-test='login-error']");
}