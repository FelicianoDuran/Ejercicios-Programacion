/**
 *
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según el cargo que desempeña,los días de viaje y su estado civil.
 *
 * 
 *
 * @author Feliciano Durán
 */

public class Ejercicio24 {
  public static void main (String[] args) {
    System.out.println("¿Cuál es el cargo del empleado? (escriba el cargo con 1,2,3):\n");
    System.out.println("1. Prog. junior\n");
    System.out.println("2. Prog. senior\n");
    System.out.println("3. Jefe de proyecto\n");
    int cargo = Integer.parseInt(System.console().readLine());
    String cargoTexto = "";
    double sueldoBase = 0;
    
    switch (cargo) {
      case 1:
        cargoTexto = "Prog. junior";
        sueldoBase = 950;
        break;
      case 2:
        cargoTexto = "Prog. senior";
        sueldoBase = 1200;
        break;
      case 3:
        cargoTexto = "Jefe de proyecto";
        sueldoBase = 1600;
        break;
    }
    
    System.out.println("\n¿Cuántos días ha estado de viaje durante el mes?");
    int diasViaje = Integer.parseInt(System.console().readLine());
    double sueldoNeto;
    
    sueldoNeto = sueldoBase + 30 * diasViaje;
    
    System.out.println("\n¿Cuál es su estado civil? (escriba el número del 1 - 2):\n");
    System.out.println("1. Soltero\n");
    System.out.println("2. Casado\n");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    double nomina = 0;
    double irpf = 0;
    if (estadoCivil == 1) {
      irpf = 0.25;
      nomina = sueldoNeto * (1 - 0.25);
    } else if (estadoCivil == 2) {
      irpf = 0.2;
      nomina = sueldoNeto * (1 - 0.2);
    }
    
    System.out.printf("\n");
    System.out.printf("Salario   %.2f€\n", sueldoBase);
    System.out.printf("Viajes                   %.2f€\n", diasViaje);
    System.out.printf("Salario neto                      %.2f€\n", sueldoNeto);
    System.out.printf("Descuento por IRPF         %.2f€\n", sueldoNeto-nomina);
    System.out.printf("Salario nómina                   %.2f€\n", nomina);
    
  }
}
