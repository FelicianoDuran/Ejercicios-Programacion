/**
 * 
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 * sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 * con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 *
 * @author Feliciano Duran
 */
public class Ejercicio15 {

  public static void main(String[] args) {
    
    
    int notas = 4 * (int)(Math.random() * 7 + 1);
    String almacenar = "";
    
    System.out.println("A continuación se van a formar unas melodías aleatorias con un compás de 4 notas: ");
    
    for(int contadorNotas = 0; contadorNotas <= notas; contadorNotas++){
      
      switch((int)(Math.random() * 7)) { 
        case 0:
          almacenar = "do ";
          break;
        case 1:
          almacenar = "re ";
          break;
        case 2:
          almacenar = "mi ";
          break;
        case 3:
          almacenar = "fa ";
          break;
        case 4:
          almacenar = "sol ";
          break;
        case 5:
          almacenar = "la ";
          break;
        case 6:
          almacenar = "si ";
          break;

        default:
        
        }System.out.print(almacenar + " ");
        
      
    }  System.out.print("||");
  }   
}
