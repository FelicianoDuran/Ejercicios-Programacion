/**
 * Salida formateada
 *
 * @author Luis J. Sánchez
 */

public class SalidaFormateada02 {
  public static void main(String[] args) {
    System.out.println("  Artículo      Precio/caja    Nº cajas");
    System.out.println("-----------------------------------------");
    System.out.printf("%-10s      %8.2f      %6d\n",  "Carlus", 4.5, 10);
    System.out.printf("%-10s      %8.2f      %6d\n",  "Tseegh", 2.75, 120);
    System.out.printf("%-10s      %8.2f      %6d\n",  "Nandaeo", 10.0, 6);
  }
}
