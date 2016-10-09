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
    
    if (horas < 40) { // Si hubiera trabajado menos de 40horas las cobraría a 12 euros
      sueldoSemanal = 12 * horas;
      } else {
      sueldoSemanal = (40 * 12) + ((horas - 40) * 16); // En caso de que hubiera estado mas de 40horas
    }                                                  // empezaría a cobrarlas a partir de ahí a 16 euros
      System.out.println("El sueldo semanal que recibes es de : \n" + sueldoSemanal + "€" );
  }
}
