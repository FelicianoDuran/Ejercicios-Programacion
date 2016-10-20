/**
 *  
 *   Escribe un programa que diga cuál es la primera cifra de un número entero
 *   introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Feliciano Durán
 */
public class Ejercicio18 {

  public static void main(String[] args) {
  
    System.out.print("Introduzca un número entero no superior a 5 dígitos para saber cual es la primera cifra => ");
    int n = Integer.parseInt(System.console().readLine());
    
      if (n<10){
        System.out.println("La primera cifra de dicho número es = " + n );
      
        } else if (n<100) {
          System.out.println("La primera cifra de dicho número es = " + (n/10));
        } else if (n<1000) {
          System.out.println("La primera cifra de dicho número es = " + (n/100));
        } else if (n<10000) {
          System.out.println("La primera cifra de dicho número es = " + (n/1000));
        } else if (n<100000) {
          System.out.println("La primera cifra de dicho número es = " + (n/10000));
        } else {
          System.out.println("No ha introducido un número correcto");
        } 
  }  
}      
      
  
