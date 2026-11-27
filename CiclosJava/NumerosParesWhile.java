
public class NumerosParesWhile{
   public static void main(String[] args) {
     System.out.println("*** Numeros pares con ciclo While ***");
     var contador = 0;
     while (contador <= 50) {
        if (contador % 2 == 0)
          System.out.print(contador + " ");
            contador++;
     }
   }
}
