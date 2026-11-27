import java.util.Scanner;

public class SistemaAdministracionCuenta{
 public static void main(String[] args) {
   Scanner consola = new Scanner(System.in);
   var salir = false;

    while (!salir) {
      System.out.println(""" 
        *** Sistema de admistracion de cuentas ***
        menu: 
        1.- crear una cuenta
        2.- eliminar cuenta
        3.- salir
        escoge una opcion:\s
        """);
      var opcion = consola.nextLine();

      switch (opcion) {
        case "1" -> System.out.println("Creando tu cuenta...\n");
        case "2" -> System.out.println("Eliminando tu cuenta...\n");
        case "3" -> {
        System.out.println("Saliendo del sistema.. hasta pronto! ");
        salir = true;
        }
        default -> System.out.println("Opcion invalida elige una opcion valida\n");
      }
    }
    System.out.println("Fin del sistema de administracion de cuentas. Adios");
 }
}
