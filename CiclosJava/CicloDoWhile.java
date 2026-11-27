import java.util.Scanner;

public class CicloDoWhile{
 public static void main(String[] args) {
    Scanner consola =  new Scanner(System.in);

   System.out.println("*** Ciclo do while en java ***");

    System.out.println("Hola ingresa un numero del 1 al 20");
    var contador = Integer.parseInt(consola.nextLine());
    
    do {
      System.out.println(contador);
      contador++; 
    } while (contador <= 20);
  }
}
