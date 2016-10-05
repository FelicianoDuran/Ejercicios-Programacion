/**
* Lectura de datos desde teclado
*
* @author FelicianoD.
*/

public class Ejercicio04 {
  public static void main(String[] args) {

      String linea;

      System.out.print("Por favor, introduce un número: ");
      linea = System.console().readLine();
      double primerNumero;
      primerNumero = Double.parseDouble( linea );
      
      System.out.print("introduce otro, por favor: ");
      linea = System.console().readLine();
      double segundoNumero;
      segundoNumero = Double.parseDouble( linea );
      
      double multi;
      multi = (primerNumero * segundoNumero);
      System.out.print("El primer número introducido es " + primerNumero);
      System.out.println(" y el segundo es " + segundoNumero);
      System.out.print("El resultado del primero por el segundo es ");
      System.out.print(multi); 
      
      double division;
      division = ((double)primerNumero / (double)segundoNumero);
      System.out.print("\nEl resultado del primero entre el segundo es ");
      System.out.print(division);
      
      double suma;
      suma = (primerNumero + segundoNumero);
      System.out.print("\nEl resultado del primero mas el segundo es ");
      System.out.print(suma);
      
      double resta;
      resta = (primerNumero - segundoNumero);
      System.out.print("\nEl resultado del primero menos el segundo es ");
      System.out.print(resta);
  }
}
