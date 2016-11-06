/**
 *
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 * los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
 * debe introducir por teclado.
 *
 * @author Feliciano Durán
 */
import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Tendra que introducir un numero que mostrará los n primero términos de la serie de Fibonacci");
    
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    int x = 0;
    int y = 1;
    int contador = 0;
    
    int AUX;
    
     System.out.print("" + x);
     
    do {
      System.out.print(" " + y);
      AUX = x;
      x = y; 
      y = AUX + x;
      contador++;
    } while (contador < numeroIntroducido);
  }
}

