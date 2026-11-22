import java.util.Scanner;

public class TiendaEnLinea{
  public static void main(String[] args) {
      Scanner consola = new Scanner(System.in);
    System.out.println("-------Tienda en linea------");
    
    System.out.println("¿Cuentas con Membresia? True/False");
    var tieneMembresia = consola.nextBoolean();
    System.out.println("¿Cual fue el monto de tu compra?");
    var montoTotal = consola.nextDouble();
    var porcentajeDescuento = 0.0;
      if (montoTotal > 1000 && tieneMembresia == true){
        System.out.println("Felicidades Tienes un descuento del 10%");
      porcentajeDescuento = 0.10;
    }else if (tieneMembresia == true){
      System.out.println("Felicidades Tienes un descuento del 5%");
      porcentajeDescuento = 0.05;
    }
      else{
        System.out.println("No tienes descuento");
    }
    var montoDescuento = montoTotal * porcentajeDescuento;
    var montoFinal = montoTotal - montoDescuento;
    System.out.printf("Monto de la compra: $%.2f%n", montoTotal);
    System.out.printf("Monto del descuento: $%.2f%n", montoDescuento);
    System.out.printf("Monto final de la compra con descuento: $%.2f%n", montoFinal);

  }
}
