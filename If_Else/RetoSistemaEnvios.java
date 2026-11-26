import java.util.Scanner;

public class RetoSistemaEnvios{
  public static void main(String[] args) {
  Scanner consola = new Scanner(System.in);

    System.out.println("**** Sistema de envios ****");
    
    final  double TARIFA_NACIONAL = 10;
    final double TARIFA_INTERNACIONAL = 20;

    System.out.println("¿Hola cual es tu nombre?");
    var nombre = consola.nextLine();
  
    System.out.println("¿Tu envio es nacional o internacional?");
    var tipoEnvio = consola.nextLine();

    System.out.println("¿Cual es el peso de tu paquete en kilogramos?");
    var pesoPaquete = Double.parseDouble(consola.nextLine());

    if(tipoEnvio.equalsIgnoreCase("nacional")){
      var envioNacional = pesoPaquete * TARIFA_NACIONAL;
      System.out.println("Hola " + nombre + " el costo de tu envio es de $" + envioNacional);
    }else if(tipoEnvio.equalsIgnoreCase("internacional")){
      var envioInternacional = pesoPaquete * TARIFA_INTERNACIONAL;
      System.out.println("Hola " + nombre + " el costo de tu envio es de $" + envioInternacional);
    }else{
      System.out.println("Destino Invalido");
    }
  }
}
