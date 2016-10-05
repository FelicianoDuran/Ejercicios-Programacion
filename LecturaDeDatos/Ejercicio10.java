/**
 * Lectura de datos desde teclado
 *
 * Realiza un conversor de Mb a Kb.
 *
 * @author Feliciano Duran
 */

public class Ejercicio10 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduce el número de Mb: ");
    double mb = Double.parseDouble(System.console().readLine());
    System.out.println(mb + "Mb equivalen a " +  (mb * 1024) + " Kb");
  }
}
