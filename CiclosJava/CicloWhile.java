import java.util.Scanner;

public class CicloWhile{
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    

    System.out.println("*** Ciclo while en java ***");
    System.out.println("Holaaaa papulince, ingresa un numero para probar en un ciclo while");
    var numeroCiclo = Integer.parseInt(consola.nextLine());

    while (numeroCiclo <= 20) {
      System.out.println(numeroCiclo);
      numeroCiclo++;
      
    }
  }
}
