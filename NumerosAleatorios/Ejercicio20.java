/**
 * 
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 *
 * @author Feliciano Duran
 */
public class Ejercicio20 {

  public static void main(String[] args) {

    System.out.print("Introduzca la capacidad del recipiente: ");
    int capacidad = Integer.parseInt(System.console().readLine());

    int litros = (int)(Math.random() * (capacidad + 1));  
        
    for (int i = 0; i < capacidad; i++) {
      if (i < (capacidad - litros)) {
        System.out.println("*    *");
      } else {
        System.out.println("*====*");
      }
    }
        
    System.out.println("******"); // la ultima fila del recipiente
    System.out.print("El recipiente tiene una capacidad de " + capacidad);
    System.out.print(" litros y contiene " + litros + " litros de agua.");
  }
}
