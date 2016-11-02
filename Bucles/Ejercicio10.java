/**
 *
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 *
 * @author Feliciano Durán
 */
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("\nVamos a realizar la media de un conjunto de números que introduzca usted.");
    System.out.println("Puede introducir tantos número como desee");
    System.out.println("El programa terminará cuando se introduzcan numeros negativos");
    
    
    Scanner s = new Scanner(System.in);
    int contador = 0;
    int cuenta = 0;
    int numero = 0; 
    
    do {
      System.out.print("\nIntroduzca un número: ");
      numero = Integer.parseInt(s.nextLine());
      if (numero >0) {
        cuenta +=numero;
      
      contador ++;}
    } while (numero >0);
    
    System.out.println("\nLa media de los números introducidos es: " + (cuenta / contador));
    
  }
}
