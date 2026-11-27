import java.util.Scanner;

public class SumaAcumulativaFor{
 public static void main(String[] args) {
   Scanner consola = new Scanner(System.in);

    System.out.println("*** Suma Acumulativa con ciclo for ***");

    final var MAXIMO = 20;

    System.out.println("Hola elige un numero del 1 al 20 para hacer una suma acumulativa");
    var numero = Integer.parseInt(consola.nextLine());

    var acumulador = 0;

    if (numero <= MAXIMO && numero >= 1){
      for (var contador = 1; contador <= numero;contador++) {
          acumulador += contador;
      }
      System.out.println(acumulador);
    }else{
    System.out.println("Numero Invalido");
    }
 }
}
