/**
 * 
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 *
 * @author Feliciano Duran
 */
public class Ejercicio13 {

  public static void main(String[] args) {
    
    int tirada1 = 0;
    int tirada2 = 0;
    
    
    
    System.out.println("Pulse INTRO se van a generar 2 numero aleatorios hasta que sean iguales.");
    System.console().readLine();
    
    do {
      
    tirada1=((int)(Math.random()* 6) + 1);
      
      System.out.print(tirada1 + " ");
      
      
    tirada2=((int)(Math.random()* 6) + 1);
      
      System.out.print(tirada2 + " ");
    
    System.out.println();
    
    }while (tirada1 != tirada2);
   
  }
}
