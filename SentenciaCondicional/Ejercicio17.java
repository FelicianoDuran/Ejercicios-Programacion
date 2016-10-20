/**
 *  
 *  Escribe un programa que diga cuál es la última cifra de un número
 *  entero introducido por teclado.
 *
 * @author Feliciano Durán
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
      System.out.println("La última cifra de dicho número es = " + (n % 10));
  }
}
