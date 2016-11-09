/**
 *
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 *
 * @author Feliciano Durán
 */
import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero y positivo al que se le sumarán los 100 siguientes números: \n");
    Scanner s = new Scanner(System.in);
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    int resultado = 0;
    if (numeroIntroducido >= 0) {
    for (int i= 0; i < 100; i++){
      resultado += numeroIntroducido + i;
    }
    System.out.println("La suma de de los 100 primeros numeros es " + resultado);
    }
  }
}
    
