/**
 * 
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 * @author Feliciano Duran
 */
 public class Ejercicio27 {

  public static void main(String[] args) {
    System.out.println(" Introduzca un numero mayor que 1: ");
    
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int cuenta = 0;
    int suma = 0;

      for (int i = 1; i < numeroIntroducido; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
        
    System.out.print("Desde 1 hasta " + numeroIntroducido + " hay " + cuenta);
    System.out.print(" múltiplos de 3 y suman " + suma);
  }
}
