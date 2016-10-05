/**
 * Operaciones y asignaciones
 *
 * @author Feliciano.D
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Por favor, introduce el numero de pesetas: ");
    linea = System.console().readLine();
    double pesetas;
    pesetas = Double.parseDouble( linea );
    
    double euros;
    euros = (double)(pesetas / 166.382);
    
    System.out.println("El numero de euros es " + euros);
    
  }
}
  
