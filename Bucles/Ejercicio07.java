/**
 *    Realiza el control de acceso a una caja fuerte. La combinación
 *    será un número de 4 cifras. El programa nos pedirá la combinación
 *    para abrirla. Si no acertamos, se nos mostrará el mensaje
 *    “Lo siento, esa no es la combinación” y si acertamos se nos dirá
 *    “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
 *    oportunidades para abrir la caja fuerte.
 * 
 * @author Feliciano Durán
 */
import java.util.Scanner;
public class Ejercicio07 {

  public static void main(String[] args) {
    
    System.out.println("Introduzca la clave de la caja fuerte: ");
    System.out.println("Tiene 4 intentos");
    System.out.println("------------- \n");
    
    Scanner s = new Scanner(System.in);
    int combinacion = 1234;
    int intentos = 0;
    
    do {
      System.out.println("\nIntroduce el número secreto: "); 
      System.out.println("Número de intentos: " + intentos);
      int numero = Integer.parseInt(s.nextLine());
      if (numero == 1234) {
        System.out.println("\n¡Enhorabuena, has acertado!");
      } else {
        System.out.println("\nCódigo incorrecto, Intentelo de nuevo");
        intentos ++;
      }
    } while (intentos <4);
    
  }
}
