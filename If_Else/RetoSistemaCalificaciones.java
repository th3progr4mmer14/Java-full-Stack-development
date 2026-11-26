import java.util.Scanner;

public class RetoSistemaCalificaciones{
  public static void main(String[] args) {
  Scanner consola = new Scanner(System.in);
    System.out.println("*** Sistema de calificaciones ***");
  
    System.out.println("¿Cual es tu nombre?");
    var nombre = consola.nextLine();

    System.out.println("Proporciona una calificacion entre 0 y 10: ");
    var numCalificacion = Double.parseDouble(consola.nextLine());
  
    var calificacionLetra = " ";

    if (numCalificacion < 0 || numCalificacion > 10){
      System.out.println("Numero invalido");
    }else{
      if(numCalificacion >= 9 &&  numCalificacion <= 10){
        calificacionLetra = "A";
      }else if(numCalificacion >= 8 &&  numCalificacion < 9){
        calificacionLetra = "B";
      }else if(numCalificacion >= 7 && numCalificacion < 8){
        calificacionLetra = "C";
      }else if(numCalificacion >= 6 && numCalificacion < 7){
        calificacionLetra = "D";
      }else if(numCalificacion >= 0 && numCalificacion < 6){
        calificacionLetra = "F";
      } 
      System.out.printf("Hola %s, tu calificacion de: %.2f, equivale a un: %s%n", nombre, numCalificacion, calificacionLetra);
    }
  }
}
