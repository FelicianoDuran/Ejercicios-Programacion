/**
 *
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Feliciano Durán
 */
import java.util.Scanner;
public class Ejercicio08 {

  public static void main(String[] args) {
    
    System.out.print("Este programa muestra la tabla de multiplicar de un número introducido: ");
    Scanner numero = new Scanner(System.in);
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
    }

  }
}
