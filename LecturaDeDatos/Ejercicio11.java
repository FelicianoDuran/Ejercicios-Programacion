/**
 * Lectura de datos desde teclado
 *
 * Realiza un conversor de Mb a Kb.
 *
 * @author Feliciano Duran
 */

public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduce el número de Kb: ");
    double kb = Double.parseDouble(System.console().readLine());
    System.out.println(kb + "kb equivalen a " +  (kb / 1024) + " mb");
  }
}
