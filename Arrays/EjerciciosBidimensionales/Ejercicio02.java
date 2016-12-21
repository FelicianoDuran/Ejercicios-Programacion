/**
 * 
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 *
 * @author Feliciano Duran
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    
    int[][] n = new int[4][5];
    int fila;
    int columna;
    int sumaFila;
    int sumaColumna = 0;
    System.out.println("Vaya introduciendo números para los valores de un array de 4 filas y 5 columnas, es decir tiene que introducir 20 valores: ");
    
    
    for (fila = 0; fila < 4; fila++) {
     for (columna = 0; columna < 5 ; columna++) { //recoge datos
       System.out.print("Almacena datos: ");
       System.out.print("Fila " + fila + ", columna " + columna + " = ");
       n[fila][columna] = Integer.parseInt(System.console().readLine());
      }
    }
    
    for (fila = 0; fila < 4; fila++){
      sumaFila = 0; 
      for (columna = 0; columna < 5 ; columna++) {
        sumaColumna += n[fila][columna];
         System.out.printf("%5d   ", n[fila][columna]);
         sumaFila += n[fila][columna];
      }
        System.out.printf("| %5d\n", sumaFila);
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
    }
      
  }
}
    
