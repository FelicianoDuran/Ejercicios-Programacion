/**
 *
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado. 
 *
 * @author Feliciano Durán
 */
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
  
   System.out.println("Este programa muestra por pantalla el cuadrado el cuadrado y el cubo de los 5 primeros numeros que introduzca");
   Scanner numero = new Scanner(System.in);
  
   int numeroIntroducido = Integer.parseInt(numero.nextLine());
   
   for(int i = numeroIntroducido; i < numeroIntroducido + 5; i++ ){
    System.out.printf("%5d=> %6d=> %6d\n", i, i * i, i * i * i);
    }
  }
} 
