/**
 *  Lectura de datos desde teclado
 *
 *  Escribe un programa que calcule el total de una factura a partir
 *  de la base imponible
 *
 * @author Feliciando Duran
 */

public class Ejercicio07 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Base imponible %5.2f\n", baseImponible);
    System.out.printf("IVA            %5.2f\n", ((baseImponible * 21 / 100)));
    System.out.printf("                   \n");
    System.out.printf("TOTAL          %5.2f\n", (baseImponible * 1.21));
  }
}
