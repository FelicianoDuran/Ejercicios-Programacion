/**
 *  Lectura de datos desde teclado
 *
 *
 *
 * @author Feliciando Duran
 */

public class Ejercicio06 {
  public static void main(String[] args) {

    System.out.println("Área de un triángulo");
    System.out.print("Por favor, introduzca la base del triángulo en (cm): ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, Introduzca la altura (cm): ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El área del triángulo es " + ((base * altura / 2)) + " centimentros cuandrados");
  }
}
