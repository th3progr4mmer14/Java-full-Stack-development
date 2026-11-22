import java.util.Scanner;

public class SistemaBancario{
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    
    System.out.println("¿Desea salir del sistema bancario? True/False");
    var sarlirDelSistema = consola.nextBoolean();
    if(!sarlirDelSistema){
      System.out.println("Continuamos dentro del sistema");
    }else{
      System.out.println("Saliendo del sistema...");
    }
  }
}
