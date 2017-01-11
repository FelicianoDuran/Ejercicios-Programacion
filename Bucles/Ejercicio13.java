/**
 *
 *
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos. 
 *
 *
 * @author Feliciano Durán
 */
import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
  
    System.out.println("Introduzca 10 números enteros(pueden ser positivos o negativos): ");
    Scanner numero = new Scanner(System.in);
    int negativos = 0;
    int positivos = 0;
    
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    do {
      
      if(numeroIntroducido < 0) {
      negativos++;
      } else {
        positivos++;
      }
    }while(numeroIntroducido < 10);
    
    System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");

  }
}
