import java.util.Scanner;

public class RetoEstacionesAño {

  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    System.out.println("*** Identificador de estacion del año ***");

    System.out.println("Proporciona el valor de un mes (un numero del 1 al 12) ");
    var numeroMes = Integer.parseInt(consola.nextLine());

    var estacion = "";
    if (numeroMes == 1 || numeroMes == 2 || numeroMes == 12) {
      estacion = "Invierno";
    } else if (numeroMes == 3 || numeroMes == 4 || numeroMes == 5){
      estacion = "Primavera";
    } else if (numeroMes == 6 || numeroMes == 7 || numeroMes == 8){
      estacion = "Verano";
    } else if (numeroMes == 9 || numeroMes == 10 || numeroMes == 11){
      estacion = "Otoño";
    } else {
      System.out.println("Estacion desconocida" + numeroMes);
    }
      System.out.printf("La estacion para el mes %d es %s%n", numeroMes, estacion);
  }
}
