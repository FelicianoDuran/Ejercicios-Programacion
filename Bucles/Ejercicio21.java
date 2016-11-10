/**
 *
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 *
 * @author Feliciano Durán
 */
import java.util.Scanner;

public class Ejercicio21 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Este programa recogera los numeros que vaya introduciendo para calcular la media de los impares, el mayor");
    System.out.print("de los pares y finalizará cuando detecte un número negativo");
    int contador = 0;
    int cuenta = 0;
    int numero = 0; 
    int mayorPar = 0;
    int cantidad = 0;
    
    do {
      System.out.print("\nIntroduzca un número: ");
      numero = Integer.parseInt(s.nextLine());
      if ((numero % 2 !=  0) && (numero > 0)) {
        cuenta +=numero;
        contador ++;
      }
      
      if ((numero % 2 ==  0) && (numero > 0)) {
        if (numero > mayorPar) {
          mayorPar = numero;
        }
      }
      cantidad++;
         } while (numero >0);
    System.out.println("\nLa media de los números introducidos es: " + (cuenta / contador));
    System.out.println("\nEl mayor de los numeros pares es: " + mayorPar);
    System.out.println("\nEl numero total introducidos es: " + (cantidad -1));
    
  }
}
