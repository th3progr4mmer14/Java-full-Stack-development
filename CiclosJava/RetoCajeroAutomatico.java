import java.util.Scanner;

public class RetoCajeroAutomatico{
 public static void main(String[] args) {
  Scanner consola = new Scanner(System.in);

    var salir = false;
    var saldo = 1000.0;

    do {
      System.out.println(""" 
      *** Cajero Automatico ***
      1. Consultar tu saldo
      2. Retiro de efectivo
      3. Deposito de efectivo
      4. Salir
      Selecciona una opcion:
      """);
      var opcion = consola.nextInt();

      switch (opcion){
        case 1 -> System.out.println("Tu saldo actual es de = " + saldo);
        case 2 -> {
        System.out.println("¿Cuanto quieres retirar?");
        var retiro = consola.nextDouble();
          if (retiro <= saldo){
          saldo -= retiro;
          System.out.println("Tu nuevo saldo es de: " + saldo);
          }else{
          System.out.println("Saldo insuficiente.. ingresa otra cantidad.");
          }
        }
        case 3 -> {
        System.out.println("¿Cuanto quieres depositar?");
        var deposito = consola.nextDouble();
        saldo += deposito;
        System.out.println("Tu nuevo saldo es de: " + saldo);
        }
        case 4 -> {
          System.out.println("Saliendo del sistema. Hasta pronto!");
        salir = true;
          }
        default -> System.out.println("Opcion invalida selecciona una opcion valida");
        } 
    } while (!salir);
 }
}
