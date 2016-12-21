/**
 * 
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma total
 *  aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el
 *  ordenador se queda pensando antes de mostrar los números.
 *
 * @author Feliciano Duran
 */

public class Ejercicio04 {

  public static void main(String[] args)
    throws InterruptedException {
    int[][] n = new int[4][5];
    int fila;
    int columna;
    int sumaFila;
    int sumaColumna = 0;
    
    System.out.println("Almacena datos: ");
    for (fila = 0; fila < 4; fila++) {
     for (columna = 0; columna < 5 ; columna++) { //recoge datos
       n[fila][columna] = (int)(Math.random() * 900) + 100;
      }
    }
    
    for (fila = 0; fila < 4; fila++){
      sumaFila = 0; 
      for (columna = 0; columna < 5 ; columna++) {
        sumaColumna += n[fila][columna];
         System.out.printf("%5d   ", n[fila][columna]);
         sumaFila += n[fila][columna];
         Thread.sleep(100);
      }
        System.out.printf("| %5d\n", sumaFila);
        Thread.sleep(100);
    } 
     
     
     for(columna = 0; columna < 5; columna++) {
      System.out.print("-------");
    }
    System.out.println("--------");
     
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += n[fila][columna];
      }
       System.out.printf("%5d   ", sumaColumna);
       Thread.sleep(100);
    }
      
  }
}
