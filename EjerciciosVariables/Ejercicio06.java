/**
 * Operaciones y asignaciones
 *
 * @author Feliciano.D
 */

public class Ejercicio06 {
  public static void main(String[] args) {

    double baseImponible = 55.30;
    
    System.out.printf("  Base imponible %.2f\n", baseImponible);
    System.out.printf("  IVA            %.2f\n", (baseImponible * 21 / 100));
    System.out.printf("                    \n");
    System.out.printf("  Total          %.2f\n", (baseImponible * 21 / 100) + baseImponible);
  }
}
