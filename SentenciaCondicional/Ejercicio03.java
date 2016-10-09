/**
 * Realiza un programa que calcule el salario semanal de un trabajador teniendo en cuenta
 * las horas ordinarias y extraordinarias
 *
 * @author Feliciano Durán
 */

public class Ejercicio04 {
  public static void main(String[] args) {

    System.out.println("Introduzca el número de horas trabajadas durante la semana: ");
    int horas = Integer.parseInt(System.console().readLine());
    int sueldoSemanal;
    
    if (horas < 40) {
      sueldoSemanal = 12 * horas;
      } else if (horas > 40)
      sueldoSemanal = (40 * 12) + ((horas - 40) * 16);
    }
}
