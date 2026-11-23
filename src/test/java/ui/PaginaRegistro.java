package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaRegistro {

    public static final Target Registro_Nombre = Target.the("Nombre del registro")
            .located(By.cssSelector("[data-test='first-name']"));

    public static final Target Registro_Apellido = Target.the("Apellido del registro")
            .located(By.cssSelector("[data-test='last-name']"));

    public static final Target Registro_FechaNacimiento = Target.the("Fecha de nacimiento del registro")
            .located(By.cssSelector("[data-test='dob']"));

    public static final Target Registro_Pais = Target.the("País del registro")
            .located(By.cssSelector("[data-test='country']"));

    public static final Target Registro_Postal = Target.the("Código postal del registro")
            .located(By.cssSelector("[data-test='postal_code']"));

    public static final Target Registro_NumeroCasa = Target.the("Número de casa del registro")
            .located(By.cssSelector("[data-test='house_number']"));

    public static final Target Registro_Calle = Target.the("Calle del registro")
            .located(By.cssSelector("[data-test='street']"));

    public static final Target Registro_Ciudad = Target.the("Ciudad del registro")
            .located(By.cssSelector("[data-test='city']"));

    public static final Target Registro_Estado = Target.the("Estado del registro")
            .located(By.cssSelector("[data-test='state']"));

    public static final Target Registro_Telefono = Target.the("Teléfono del registro")
            .located(By.cssSelector("[data-test='phone']"));

    public static final Target Registro_Correo = Target.the("Correo electrónico del registro")
            .located(By.cssSelector("[data-test='email']"));

    public static final Target Registro_Contrasena = Target.the("Contraseña del registro")
            .located(By.cssSelector("[data-test='password']"));

    public static final Target Registro_BotonRegistrar = Target.the("Botón Registrar")
            .located(By.cssSelector("[data-test='register-submit']"));

    public static final Target Registro_AlertaExitosa = Target.the("Alerta de registro")
            .located(By.cssSelector("[data-test='register-submit']"));
}