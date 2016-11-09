/**
 *
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 * 
 *
 *
 * @author Feliciano Durán
 */
import java.util.Scanner;

public class Ejercicio14 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Vamos a calcular la potencia a partir del valor que usted le ponga a la base y al exponente");
    
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(s.nextLine());

    double resultado = 1;
        
    if (exponente == 0) {
      resultado = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        resultado *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        resultado *= base;
      }
      
      resultado = 1/resultado;
    }

    System.out.println(base + "^" + exponente + " = " + resultado);
  }
}
