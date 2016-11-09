/**
 *
 * Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 *
 * @author Feliciano Durán
 */
import java.util.Scanner;

public class Ejercicio18 {

  public static void main(String[] args) {

    System.out.print("Introduzca 2 numeros distintos y el programa empezará por el 1º y menor de ellos\n");
    System.out.println("Apartir de ahí se irá incrementando de 7 en 7 hasta llegar al 2º valor");
  
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el primer valor");
    int primerNumero = Integer.parseInt(s.nextLine()); 
    System.out.println("Introduzca el segundo valor");
    int segundoNumero = Integer.parseInt(s.nextLine());
    
    if((primerNumero != segundoNumero) && (primerNumero < segundoNumero)) { // Con esto queremos decir, que el primero numero no puede ser igual al segundo y que el primero debe ser menor que el segundo
      for(int i = primerNumero; i < segundoNumero; i+=7) {
        System.out.println(primerNumero);
        primerNumero+=7; // El numero se incrementa de 7 en 7
      }  
    } else { 
      System.out.print("Los valores introducidos son erroneos!");
    }
  
  }
}
