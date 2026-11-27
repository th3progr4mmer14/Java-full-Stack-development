import java.util.Scanner;

public class SumaAcumulativaWhile {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Suma Acumulativa usando un ciclo while ***");

        final var MAXIMO = 20;

        System.out.println("Hola Elige un numero del 1 al 20 para hacer una suma acumulativa");
        var numero = Integer.parseInt(consola.nextLine());

        var contador = 1;
        var acumulador = 0;

        if (numero <= MAXIMO && numero >= 1) {
            System.out.println("Valores iniciales -> contador: " + contador + ", acumulador: " + acumulador);

            while (contador <= numero) {
                // Guardamos el valor anterior solo para mostrarlo
                var anterior = acumulador;
                acumulador += contador;

                // Mostramos el paso: lo que había + lo que se suma = lo que queda
                System.out.println("Vuelta " + contador + ": " + anterior + " + " + contador + " = " + acumulador);

                contador++;
            }

            System.out.println("El contador terminó en " + contador + ", ya es mayor que " + numero + ", el ciclo se detiene");
            System.out.println("La suma total es: " + acumulador);
        } else {
            System.out.println("Numero invalido");
        }
    }
}
