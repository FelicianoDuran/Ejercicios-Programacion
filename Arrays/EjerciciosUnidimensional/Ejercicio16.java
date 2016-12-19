/**
 * 
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 *
 * @author Feliciano Duran Postigo
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Se va a mostrar 20 números aleatorios comprendidos entre el 0 y el 400.");
    System.out.println("Podrá si quiere que se muestren los múltiplos de 5 o 7.");
    
    int[] array = new int[20];
    
    for (int i = 0; i < 20; i++) {
      array[i] = (int)(Math.random()*401); //genera números aleatorios entre 0 y 400 (ambos incluídos)
      System.out.print(array[i] + " ");
    }
    
    System.out.println();
    System.out.println();
    System.out.println("¿Desea mostrar los múltiplos de 5 o de 7?");
    System.out.print("Pulsa 1 para múltiplo de 5 o 2 para múltiplo de 7): ");
    int opcion = Integer.parseInt(System.console().readLine());
    
    if (opcion == 1) {
      for (int i = 0; i < 20; i++) {
        if (array[i] % 5 == 0) {
          System.out.print("[" + array[i] + "]");
        } else {
          System.out.print(array[i] + " ");
        }
      } //forr para elección 1 (mínimo)
    } else if (opcion == 2) {
      for (int i = 0; i < 20; i++) {
        if (array[i] % 7 == 0) {
          System.out.print("[" + array[i] + "]");
        } else {
          System.out.print(array[i] + " ");
        }
      }//for
    } //else if
  }
}
