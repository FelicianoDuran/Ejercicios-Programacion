/**
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 *
 * @author Feliciano Duran
 */
public class Ejercicio12 {

  public static void main(String[] args) {
    
    int n = 1;
    String verde = "\033[32m";
    while ( n > 0 ) {
      int matrix = ((int)(Math.random()*96) + 32);
      
      System.out.print(verde + (char) matrix);
    }
  }
}
