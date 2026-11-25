import java.util.Scanner;

public class DiaSemanaV2{
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    System.out.println("*** Dia de la semana con switch ***");

    System.out.print("Proporciona un dia del 1 al 7: ");
    var numDia = Integer.parseInt(consola.nextLine());

    String nombreDia;

    nombreDia = switch (numDia) {
      case 1 -> "Domingo";
      case 2 -> "Lunes";
      case 3 -> "Martes";
      case 4 -> "Miercoles";
      case 5 -> "Jueves";
      case 6 -> "Viernes";
      case 7 -> "Sabado";
      default -> "Dia no valido " + numDia;
    };
    System.out.println(nombreDia);
  }
}
