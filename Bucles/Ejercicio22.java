/**
 *
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * @author Feliciano Durán
 */
public class Ejercicio22 {

  public static void main(String[] args) {
            
    System.out.println("Este programa muestra todos los número primos entre 2 y 100 ");
    
    boolean esPrimo = true;
    
      for (int n = 2; n <= 100; n++) {
        esPrimo = true;
        for (int i = 2; i < n; i++) {
          if (n % i == 0) {
          esPrimo = false;
          }
        }
        if (esPrimo) {
          System.out.println(n + " ");
        }
      }
  }
}

