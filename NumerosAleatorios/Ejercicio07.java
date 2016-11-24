/**
 * 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres colum-
 * nas para los 14 partidos y el pleno al quince (15 filas).
 *
 * @author Feliciano Duran
 */
public class Ejercicio07 {
  public static void main(String[] args) { 
    System.out.println("Este programa muestra 3 apuestas de quinielas");
    System.out.println("en 3 columnas para los 14 partidos y el pleno al 15.");
    
    int resultadoPartido;
    int columnas = 3;
    
    for (int fila = 1; fila <= 15; fila++) { //controla las filas para las apuestas
      System.out.printf("%4d. |", fila);
      
      if (fila == 15) {
        columnas = 1;
      }
      
      for (int apuesta = 1; apuesta <= columnas; apuesta++) { //apuesta para cada columna
        resultadoPartido = (int)(Math.random()*3) + 1;
        
        switch (resultadoPartido) {
          case 1:
          System.out.print("1  |");
          break;
          
          case 2:
          System.out.print("  2|");
          break;
          
          case 3:
          System.out.print(" X |");
          break;
          
          default:
        }
      }
      System.out.println(); //salto de línea para mostrar la siguiente fila.
    }
    
  }
}
