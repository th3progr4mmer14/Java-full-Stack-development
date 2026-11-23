import java.util.Scanner;

public class AppSaludFitness{
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.println("-----App de Salud y Fitness----");

    final var metaPasosDiarios = 10000;
    final var caloriasPorPaso = 0.04;
    
    System.out.println("¿Cual es tu nombre?");
    var nombre = consola.nextLine();
    System.out.println("¿Cuantos pasos has caminado en el dia?");
    var pasosCaminados = consola.nextInt();

    var caloriasQuemadas = pasosCaminados * caloriasPorPaso;
    System.out.printf("Felicidades %s, has quemado %.2f calorias%n", nombre, caloriasQuemadas);

    var metaAlcanzada = (pasosCaminados >= metaPasosDiarios) ? "Alcanzado": "No alcanzado";
    System.out.println("Tu resultado es: " + metaAlcanzada );

  }

}
