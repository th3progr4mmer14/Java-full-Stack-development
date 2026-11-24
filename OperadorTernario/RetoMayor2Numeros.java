import java.util.Scanner;

public class RetoMayor2Numeros{
  public static void main(String[] args) {
    
    Scanner consola = new Scanner(System.in);

    System.out.println("***El mayor de 2 numeros***");

    System.out.print("Ingresa el primer numero: ");
    var primerNumero = Integer.parseInt(consola.nextLine());

    System.out.print("Ingresa el segundo numero: ");
    var segundoNumero = Integer.parseInt(consola.nextLine());
    
    var numeroMayor = (primerNumero > segundoNumero) ? primerNumero: segundoNumero;

    System.out.println("El numero mayor es: " + numeroMayor);
    
  }
}
