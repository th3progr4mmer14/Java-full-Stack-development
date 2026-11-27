import java.util.Scanner;

public class SumaAcumulativaDoWhile{
 public static void main(String[] args) {
   Scanner consola = new Scanner(System.in);
    System.out.println("Suma acumulativa usando un ciclo do while");

    final var MAXIMO = 20;

    System.out.println("Hola elige un numero del 1 al 20 para hacer una suma acumulativa");
    var numero = Integer.parseInt(consola.nextLine());

    var contador = 1;
    var acumulador = 0;

    if (numero <= MAXIMO && numero >= 1){
      do {
        acumulador += contador++;
        
      } while (contador <= numero);
      System.out.println(acumulador);
    }else{
  System.out.println("Numero invalido");
    }
 }
}
