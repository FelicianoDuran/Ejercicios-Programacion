/**
 * 
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 *
 * @author Feliciano Duran
 */
 
public class Ejercicio09 {
  public static void main(String[] args) {
    
    int contador = 0;
    int numero = 0;
    System.out.println("Este programa generará números pares aleatoriamente hasta que saque el 24:");
    while( numero!=24 ){
     numero = (int)(Math.random() * 50) * 2;
      System.out.print(numero + " ");
      contador++;
    }
      System.out.println("\nSe han generado " + contador + " números.");
    
  }
}

