/**
 *  Lectura de datos desde teclado
 *
 *  Escribe un programa que calcule el salario semanal de un empleado
 *   en base a las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Feliciando Duran
 */

public class Ejercicio08 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduce el número de horas trabajadas por semanas: ");
    
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    System.out.println("El salario semanal es de " + (horasTrabajadas * 12) + " euros.");
  }
}
