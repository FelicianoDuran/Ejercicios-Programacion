/**
 * 
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere  el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * 
 * @author Feliciano Durán
 */
 import java.util.Scanner;
public class Ejercicio23 {

  public static void main(String[] args) {

    System.out.println("Por favor, vaya introduciendo números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
	Scanner s = new Scanner(System.in);
    int numeroIntroducido;
    int suma = 0;
    int cantidadDeNumeros = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(s.nextLine());
      suma += numeroIntroducido;
      cantidadDeNumeros++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido un total de " + cantidadDeNumeros + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / cantidadDeNumeros + ".");
  }
}
