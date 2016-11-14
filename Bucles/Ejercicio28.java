/**
 * 
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * 
 * @author Feliciano Duran
 */
import java.util.Scanner;
 public class Ejercicio28 {

  public static void main(String[] args) {
  Scanner s =new Scanner(System.in);
    
    int factorial=1;
    System.out.println("Introduzca un numero y calculará su factorial: ");
    int numeroIntroducido=s.nextInt();

    for(int i = numeroIntroducido; i > 1; i--){
      factorial *= i;
      
    }
      System.out.println("El factorial de "+ numeroIntroducido +" es "+ factorial);
  }
}   
