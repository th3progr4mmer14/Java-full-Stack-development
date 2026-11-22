import java.util.Scanner;

public class NumeroPositivo {
  public static void main(String[] args) {
      Scanner consola = new Scanner(System.in);

    System.out.println("Ingresa tu numero");
    int numero = consola.nextInt();
     
    if (numero > 0){
      System.out.println("Tu numero es positivo");
    }

    else if (numero < 0){
      System.out.println("Tu numero es negativo");
    }
      else{
      System.out.println("Tu numero es 0");  
      
      }
    }
  }
