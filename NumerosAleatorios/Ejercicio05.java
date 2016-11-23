/**
 * 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 *
 * @author Feliciano Duran
 */
public class Ejercicio05 {

  public static void main(String[] args) {

  int minimo = 200;
  int maximo = 0;
  int media;
  int suma = 0;
  int n = 0;
  
    for (int i = 0; i < 50; i++) {
      n = ((int)(Math.random()* 100) + 100);
      System.out.print(n + " ");
      suma += n;
      
      if(n < minimo){
        minimo = n;
      }
      if(n > maximo){
        maximo = n;
      }
    }
    System.out.println("\nEl minimo de los numero es: " + minimo + ", el máximo es: " + maximo + ", la media es: " + suma/50);
  }
}
