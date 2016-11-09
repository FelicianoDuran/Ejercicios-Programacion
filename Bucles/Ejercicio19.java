/**
 *
 * Realiza un programa que pinte una pirámide por pantalla. La altura
 * se debe pedir por teclado. El carácter con el que se pinta la pirámide
 * también se debe pedir por teclado.
 *
 * @author Feliciano Durán
 */
import java.util.Scanner;

public class Ejercicio19 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la piramide: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el carácter con el que se pintará la piramide: ");
    String caracter = System.console().readLine();
    
    int altura = 1;
    int i = 0;
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
