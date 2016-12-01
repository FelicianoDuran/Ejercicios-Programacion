/**
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 *
 * @author Feliciano Duran
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    int notas = 0;
    int suspensos = 0;
    int suficientes = 0;
    int bien = 0;
    int notables = 0;
    int sobresalientes = 0;
    
    for (int i = 1; i <=20; i++){
    
    notas = (int)(Math.random()*5) + 1;
        
        switch (notas) {
          case 1:
          System.out.println("Suspenso  ");
          suspensos++;
          break;
          
          case 2:
          System.out.println("Suficientes  ");
          suficientes++;
          break;
          
          case 3:
          System.out.println("Bien  ");
          bien++;
          break;
          
          case 4:
          System.out.println("Notables  ");
          notables++;
          break;
          
          case 5:
          System.out.println("Sobresalientes  ");
          sobresalientes++;
          break;
          
          default:
        }
    }
    System.out.println("_____________________________");
    
    System.out.println("El numero de suspensos es: " + suspensos);
    
    System.out.println("El numero de suficientes es: " + suficientes);

    System.out.println("El numero de bien es: " + bien);

    System.out.println("El numero de notables es: " + notables);

    System.out.println("El numero de sobresalientes es: " + sobresalientes);


  }
}    
