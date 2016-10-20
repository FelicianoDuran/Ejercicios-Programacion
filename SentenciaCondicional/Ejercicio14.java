/**
 *
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 *
 * @author FelicianoDurán
 */
public class Ejercicio14 {

  public static void main(String[] args) {
    System.out.println("Introzuca un número por teclado para saber si es par y/o divisible entre 5");
    
    System.out.print("= ");
    double x = Double.parseDouble(System.console().readLine());
    
    if (x%2 == 0) {
      System.out.println("Su número es par");
      } else {
       System.out.println("Su número es impar");
       }
  
    if (x%5 == 0) {
      System.out.println("Su número es divisible entre 5");
      } else {
      System.out.println("Su número no es divisible entre 5");
       }
      
  }
}
