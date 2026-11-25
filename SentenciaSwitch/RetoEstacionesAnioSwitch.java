import java.util.Scanner;

public class RetoEstacionesAnioSwitch{
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    System.out.println("*** Estaciones del Año con Switch Mejorado ***");
    
    System.out.print("Ingresa un numero del 1 al 12: ");
    var numMes = Integer.parseInt(consola.nextLine());

    String nombreEstacion;

    nombreEstacion = switch (numMes) {
      case 1 -> "Invierno";
      case 2 -> "Invierno";
      case 3 -> "Primavera";
      case 4 -> "Primavera";
      case 5 -> "Primavera";
      case 6 -> "Verano";
      case 7 -> "Verano";
      case 8 -> "verano";
      case 9 -> "Otoño";
      case 10 -> "Otoño";
      case 11 -> "Otoño";
      case 12 -> "Invierno";
      default -> "Dia no valido " + numMes;
    };
    System.out.println(nombreEstacion);
  }
}
