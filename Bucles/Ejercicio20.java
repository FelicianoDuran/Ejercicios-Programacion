/**
 *
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 *
 * @author Feliciano Durán
 */
import java.util.Scanner;

public class Ejercicio20 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la piramide: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el carácter con el que se pintará la piramide: ");
    String caracter = System.console().readLine();
    
    int altura = 1;
    int i = 1;
    int espacios = alturaIntroducida-1;
    
    while (altura <= alturaIntroducida) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      for (i = 1; i < altura * 2; i++) {
        System.out.print(caracter);
      }

      System.out.println();

      altura++;
      espacios--;
    }
  }
}

