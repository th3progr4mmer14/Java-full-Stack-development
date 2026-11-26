import java.util.Scanner;

public class RetoSistemaAutenticacion{
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    final var USUARIO_FINAL = "Eduardo";
    final var CONTRASENA_FINAL = "14092004";
    System.out.println("*** Sistema de autenticaicion con if_else ***");

    System.out.println("Ingresa tu usuario");
    var usuarioIngresado = consola.nextLine().strip();

    System.out.println("Ingresa tu contraseña");
    var contrasenaIngresada = consola.nextLine().strip();
    
    var mensajeAutenticacion = switch (usuarioIngresado){
      case USUARIO_FINAL -> {
        if (CONTRASENA_FINAL.equals(contrasenaIngresada))
          yield "Bienvenido al sistema";
        else
          yield "Contraseña incorrecta, favor de corregirla";
      }
      default -> {
        if (CONTRASENA_FINAL.equals(contrasenaIngresada))
          yield "Usuario Incorrecto, favor de corregirlo";
        else
          yield"Usuario y contraseña incorrectos, intente de nuevo..";
      }
    };
    System.out.println(mensajeAutenticacion);
  }
}
