/**
 * 
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir
 * un número al usuario. Se debe comprobar que el número introducido por
 * teclado se encuentra dentro del array, en caso contrario se mostrará un
 * mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
 * introduzca uno correctamente. A continuación, el programa rotará el array
 * hacia la derecha las veces que haga falta hasta que el número introducido
 * quede situado en la posición 0 del array. Por último, se mostrará el array rotado
 * por pantalla.
 *
 * @author Feliciano Duran Postigo
 */
public class Ejercicio17 {
  public static void main(String[] args) {
  
  
    System.out.println("Se va a mostrar 10 números aleatorios comprendidos entre el 0 y el 00.");
    System.out.println("Usted deberá introducir un número que se encuentre en el array.");
    System.out.println("Tras introducir el número correcto, el array rotará hasta que SU número");
    System.out.println("se encuentre en la posición 0.");
    System.out.println("________________________________________________________________________");
    
    int[] array = new int[10];
    int numero = 0;
    boolean numeroCorrecto = false;
    
    
    System.out.println("\n┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
          System.out.print("│ Indice  ");
          for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
          }
          System.out.println("│\n├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
          System.out.print("│ Valor   ");
          for (int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random()*101);
            System.out.printf("│%4s ", array[i]);
          }
          System.out.println("│\n└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        
    System.out.println();
    System.out.println();
    
    //while comprueba que le numero esté dentro del array ////////////////////////////7
    while (!numeroCorrecto) {
      System.out.println("Por favor, introduzca un número que esté dentro del array: ");
      numero = Integer.parseInt(System.console().readLine());
      
      for (int i = 0; i < 9; i++) {
        if (array[i] == numero) {
          numeroCorrecto = true;
        }
      }
    } 
    ///////////////////////////////////////////////////////////////7///////////////////
    
    
    while (numero != array[0]) {
      int aux = array[9];
      
      for (int i = 9; i > 0; i--) {
        array[i] = array[i - 1]; 
      }
      
      array[0] = aux;  
    } 
    
  
    System.out.println("\n┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Indice  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
      }
    System.out.println("│\n├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor   ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4s ",array[i]);
      }
    System.out.println("│\n└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
