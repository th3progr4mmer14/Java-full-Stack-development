import java.util.Scanner;

public class SistemaCalificaciones{
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    System.out.println("*** Sistema de calificaciones ***");
    System.out.println("¿Cual es tu nombre?");
    var nombre = consola.nextLine();
    
    System.out.println("Ingrese una calificacion numeriaca del 0 al 10");
    var numCalificacion = Integer.parseInt(consola.nextLine());

    char letraCalificacion;

    letraCalificacion = switch (numCalificacion){
      case 9,10 -> 'A';
      case 8 -> 'B';
      case 7 -> 'C';
      case 6 -> 'D';
      case 0,1,2,3,4,5 -> 'F';
      default -> '?';
    };
    System.out.printf("Hola %s, tu calificacion: %d equivale a un: %c%n", nombre, numCalificacion,letraCalificacion);
  }
}
