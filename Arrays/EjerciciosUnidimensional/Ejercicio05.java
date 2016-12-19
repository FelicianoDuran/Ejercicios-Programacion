/**
 * 
 * Escribe un programa que pida 10 números por teclado y que luego muestre
 * los números introducidos junto con las palabras “máximo” y “mínimo” al lado
 * del máximo y del mínimo respectivamente.
 *
 * @author Feliciano Duran
 */
public class Ejercicio05 {
  public static void main(String[] args) {
      
    int[] numero = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE; //consultar
    int i;
    System.out.println(Integer.MIN_VALUE);
    System.out.println("Introduzca 10 numeros enteros y pulse INTRO para poder seguir introduciendo.");
    System.out.println("El programa dirá cual de los valores que ha introducido es el máximo y el mínimo");
    
    for (i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
      
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
      
      if (numero[i] > maximo)  {
        maximo = numero[i];
      }
    }
    
    System.out.println();
/*
    for (i = 0; i < 10; i++) {
      System.out.print(numero[i]);
      if (numero[i] == maximo) {
        System.out.print(" máximo");
      }
      
      if (numero[i] == minimo) {
        System.out.print(" mínimo");
      }
      System.out.println();
       
    }
    */
  System.out.println("maximo: " + maximo);
  System.out.println("minimo: " + minimo);
   }
}
