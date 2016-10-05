/**
 * Operaciones y asignaciones
 *
 * @author FelicianoD.
 */

public class Ejercicio01 {
  public static void main(String[] args) {

    int x = 144;
    int y = 999;

    int sum = x + y;
    System.out.println("La suma de mis variables es " + sum);
    
    int mul = x * y;
    System.out.println("La multiplicación de mis variables es " + mul); 
    
    double div = (double)x / (double)y;
    System.out.printf("La división de mis variables es %.3f \n", div);

    int resta = x - y;
    System.out.println("La resta de mis variables es " + resta);  
  }
}
