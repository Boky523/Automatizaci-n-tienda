Feature: Iniciar sesión con credenciales inválidas
  Para verificar que el sistema rechace el acceso y muestre un mensaje de error

  @login-invalido
  Scenario: Intentar iniciar sesión con credenciales inválidas
    Given que el usuario accede a la página de inicio de sesión
    When ingresa el correo "usuario.invalido@ejemplo.com" y la contraseña "ClaveInvalida123!"
    Then el sistema muestra un mensaje de error de inicio de sesión