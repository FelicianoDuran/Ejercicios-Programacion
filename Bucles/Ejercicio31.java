/*
 *
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 *
 * @author Feliciano Duran
 *
 */
import java.util.Scanner;

public class Ejercicio31 {
  public static void main(String[] args) {
    System.out.println("\nVamos a dibujar una \"L\" con la altura que usted introduzca");
    System.out.print("Por favor, introduzca la altura: ");
    
    Scanner n = new Scanner(System.in);
    int alturaIntroducida = Integer.parseInt(n.nextLine()); //el usuario introduce la altura de la "L"
    
    for (int i = 1; i < alturaIntroducida; i++) { //pinta la altura de la "L"
      System.out.println("*");
    }
    
    int base = (alturaIntroducida / 2) + 1;
    
    for (int i = 1; i <= base; i++) { //pinta la base de la "L"
      System.out.print("*");
    }
    
  }
}
