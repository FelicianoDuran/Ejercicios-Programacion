/**
 * 
 * Escribe un programa que rellene un array de 100 elementos con números ente-
 * ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 *
 * @author Feliciano Duran
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    int[] n = new int[100];
    int minimo = 500;
    int maximo = 0;
    
    for (int i = 0; i < 100; i++) {
      n[i] = (int)(Math.random()*501); //genera números aleatorios entre 0 y 500 
      System.out.print(n[i] + " ");
      
      if (n[i] < minimo) {
        minimo = n[i];
      } //if que cambia el valor al número mínimo
      
      if (n[i] > maximo) {
        maximo = n[i];
      } //if que cambia el valor al número máximo
    }

    System.out.println();
    System.out.println("¿Desea mostrar el valor mínimo o máximo?");
    System.out.print("(pulse 1 para mínimo o 2 para máximo): ");
    int opcion = Integer.parseInt(System.console().readLine());
    
    if (opcion == 1) {
      for (int i = 0; i < 100; i++) {
        if (n[i] == minimo) {
          System.out.print("*" + n[i] + "*");
        } else {
          System.out.print(n[i] + " ");
        }
      } //forr para elección 1 (mínimo)
    } else if (opcion == 2) {
      for (int i = 0; i < 100; i++) {
        if (n[i] == maximo) {
          System.out.print("**" + n[i] + "**");
        } else {
          System.out.print(n[i] + " ");
        }
      }//for
    } //else if
  }
}
    
