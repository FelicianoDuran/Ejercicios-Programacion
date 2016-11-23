/**
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * 
 * @author Feliciano Duran
 */
public class Ejercicio01 {

  public static void main(String[] args) {
  System.out.println("Vamos a mostrar la tirada de 3 dados y la suma total de todo los numeros: ");
    
    int tirada;
    int suma = 0;
    for (int i = 1; i <= 3; i++) {
      tirada=((int)(Math.random()* 6) + 1);
      System.out.println(tirada + " ");
      suma += tirada;
    }
    
    System.out.println("La suma de las 3 tirada es: "+ suma);

    System.out.println();
  }
}
