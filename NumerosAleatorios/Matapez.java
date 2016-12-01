/**
 * 
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro
 * de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 *
 * @author Feliciano Duran
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    
    System.out.println("Introduzca el valor de la anchura de la pecera(debe ser mayor a 4)");
    int ancho = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el valor de la altura de la pecera(debe ser mayor a 4)");
    int alto = Integer.parseInt(System.console().readLine());
    
    if (ancho < 4) {
      ancho = 4;
    }
    else if  (alto < 4) {
      alto = 4;
    } 
    
    int jRandom = (int) (Math.random()*(ancho - 3) + 1);
    int iRandom = (int) (Math.random()*(alto - 3) + 1);
    
    for (int i = 0; i  < alto ; i++){ // filas
      
      for (int j = 0; j < ancho; j++){
        if (i == 0 || i == (alto -1 ) || ( j == 0) || j == (ancho-1)){
          System.out.print("*");
        } else if (i == iRandom && j == jRandom ) {
          System.out.print("&");
        } else {
          System.out.print(".");
        }
      }
      System.out.println();
    }
  }
}
