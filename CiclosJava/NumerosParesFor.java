import java.util.Scanner;

public class NumerosParesFor{
 public static void main(String[] args) {
   Scanner consola = new Scanner(System.in);

    System.out.println("*** Numeros Pares con ciclo for ***");

    System.out.println("Hola Digita un numero del 1 al 50");

    for (var contador = Integer.parseInt(consola.nextLine()); contador <= 50; contador++) {
      if (contador % 2 == 0){
      System.out.println(contador);
      }
    }
 }
}
