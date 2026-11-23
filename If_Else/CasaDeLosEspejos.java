import java.util.Scanner;

public class CasaDeLosEspejos{
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.println("----Bienvenido a la casa de los espejos----");
    System.out.println("¿Cuantos años tienes?");
    var edad = consola.nextInt();
    System.out.println("¿Le tienes miedo a la obscuridad? True/False");
    var miedoObscuridad = consola.nextBoolean();
    if(edad > 10 && !miedoObscuridad){
      System.out.println("Puedes entrar a la casa de los espejos, Mucha Suerte...");
    }else{
      System.out.println("Lo Siento no puedes entrar a la casa de los espejos :( ");
    } 
  }
}
