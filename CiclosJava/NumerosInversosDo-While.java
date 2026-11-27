import java.util.Scanner;

public class NumerosInversosDoWhile{
 public static void main(String[] args) {
   Scanner consola = new Scanner(System.in);
  
    System.out.println("*** Numeros Inversos do-while ***");
    
    System.out.println("Hola Ingresa un numero del 1 al 10: ");
    var contador = Integer.parseInt(consola.nextLine());

    do {
      System.out.println(contador);
      contador--;
    } while (contador > 0);


 }
}
