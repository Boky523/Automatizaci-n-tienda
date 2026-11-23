Feature: Registro de un usuario nuevo en la tienda

@registro-Usuario
Scenario: Registro de un nuevo usuario en la tienda
Given que el usuario accede a la página de inicio de sesión para registrase
When completa el formulario de registro con los siguientes datos:
| campo            | valor               |
| nombre           | Carlos              |
| apellido         | Mendoza             |
| fechaNacimiento  | 1995-05-15          |
| codigoPais       | CO                  |
| codigoPostal     | 110111              |
| numeroCasa       | 45                  |
| calle            | Calle 100 # 15-20   |
| ciudad           | Bogotá              |
| estado           | Cundinamarca        |
| telefono         | 3001234567          |
| correo           | carlos.m@prueba.com |
| contrasena       | Segura@1234         |

Then el sistema debería mostrar pantalla de ingreso
