import java.util.Scanner;

public class OperadorTernario{
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.println("Operador Ternario");

    //Sintaxis 
    //Condicion ? Expresion1 : Expresion2
    //ejemplo para determinar si un numero es par
    System.out.println("Ingresa tu numero: ");
    var numero = consola.nextInt();
    var resultado = (numero % 2 == 0) ? "Par ": "Impar ";
    System.out.println("El numero: " + numero + " es: " + resultado);

    //Operador Ternario anidado
    resultado = (numero > 0 ) ? "Positivo": (numero < 0) ? "Negativo" : "Cero";
    System.out.println("\nEl numero " + numero + " es: " + resultado);
  }
}
