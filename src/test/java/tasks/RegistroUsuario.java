package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import ui.PaginaRegistro;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistroUsuario implements Task {

    private final String nombre;
    private final String apellido;
    private final String fechaNacimiento;
    private final String codigoPais;
    private final String codigoPostal;
    private final String numeroCasa;
    private final String calle;
    private final String ciudad;
    private final String estado;
    private final String telefono;
    private final String correo;
    private final String contrasena;

    public RegistroUsuario(String nombre, String apellido, String fechaNacimiento,
                            String codigoPais, String codigoPostal, String numeroCasa,
                            String calle, String ciudad, String estado, String telefono,
                            String correo, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.codigoPais = codigoPais;
        this.codigoPostal = codigoPostal;
        this.numeroCasa = numeroCasa;
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public static RegistroUsuario conDatos(String nombre, String apellido, String fechaNacimiento,
                                            String codigoPais, String codigoPostal, String numeroCasa,
                                            String calle, String ciudad, String estado, String telefono,
                                            String correo, String contrasena) {
        return instrumented(
                RegistroUsuario.class,
                nombre, apellido, fechaNacimiento,
                codigoPais, codigoPostal, numeroCasa,
                calle, ciudad, estado, telefono,
                correo, contrasena
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(nombre).into(PaginaRegistro.Registro_Nombre),
                Enter.theValue(apellido).into(PaginaRegistro.Registro_Apellido),
                Enter.theValue(fechaNacimiento).into(PaginaRegistro.Registro_FechaNacimiento),
                SelectFromOptions.byValue(codigoPais).from(PaginaRegistro.Registro_Pais),
                Enter.theValue(codigoPostal).into(PaginaRegistro.Registro_Postal),
                Enter.theValue(numeroCasa).into(PaginaRegistro.Registro_NumeroCasa),
                Enter.theValue(calle).into(PaginaRegistro.Registro_Calle),
                Enter.theValue(ciudad).into(PaginaRegistro.Registro_Ciudad),
                Enter.theValue(estado).into(PaginaRegistro.Registro_Estado),
                Enter.theValue(telefono).into(PaginaRegistro.Registro_Telefono),
                Enter.theValue(correo).into(PaginaRegistro.Registro_Correo),
                Enter.theValue(contrasena).into(PaginaRegistro.Registro_Contrasena),
                Click.on(PaginaRegistro.Registro_BotonRegistrar)
        );
    }
}