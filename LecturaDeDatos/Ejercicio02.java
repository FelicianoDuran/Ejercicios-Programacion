/**
 * Operaciones y asignaciones
 *
 * @author Feliciano.D
 */

public class Ejercicio02 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Por favor, introduce el numero de euros: ");
    linea = System.console().readLine();
    double euros;
    euros = Double.parseDouble( linea );
    
    double pesetas;
    pesetas = (double)(euros * 166.382);
    
    System.out.println("El numero de pesetas es " + pesetas);
    
  }
}
    
