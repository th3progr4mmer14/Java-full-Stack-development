import java.util.Scanner;

public class RetoSistemaReservas {

  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    System.out.println("-----Bienvenido al sistema de reservas-----");
    final var CON_VISTA_MAR = 190.50;
    final var SIN_VISTA_MAR = 150.50;
    
    System.out.println("¿Cual es tu nombre?");
    var nombreCliente = consola.nextLine();

    System.out.println("¿Cuantos dias te queieres quedar?");
    var diasEstadia = consola.nextInt();

    System.out.println("¿Deseas un cuarto con vista al mar? True/False");
    var tipoCuarto = consola.nextBoolean();

    var descripcionCuarto = (tipoCuarto == true)? "Con vista al mar": "Sin vista al mar";

    var precioPorDia = (tipoCuarto == true) ? CON_VISTA_MAR: SIN_VISTA_MAR;

    var costoTotal = diasEstadia * precioPorDia;

    System.out.printf("Hola: %s, Has reservado un cuarto %s, El costo por dia es de: %.2f, Tu total es de: %.2f%n", nombreCliente, descripcionCuarto, precioPorDia, costoTotal );
    
    
  }
  
}
