 /**
 * 
 *
 *  Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 *  hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 *  Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 *  por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 *  a las 15:00h.
 *
 * @author Feliciano Durán
 */

public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.print("Introduzca el día de la semana con letras (lunes a viernes): ");
    String diaSemana = System.console().readLine();
    int numeroSemana;
    
    switch (diaSemana) {
      case "lunes":
        numeroSemana = 1;
        break;
      case "martes":
        numeroSemana = 2;
        break;
      case "miercoles":
        numeroSemana = 3;
        break;
      case "jueves":
        numeroSemana = 4;
        break;
      case "viernes":
        numeroSemana = 5;
        break;
      default:
        numeroSemana = 0;
        break;
    }
    
    if (numeroSemana != 0) {
      System.out.print("Introduzca la hora: ");
      int horas = Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduzca los minutos: ");
      int minutos = Integer.parseInt(System.console().readLine());
      
      System.out.println("Faltan " + ((4 * 24 + 15 ) * 60 - (((numeroSemana - 1) * 24 + horas) * 60 + minutos)) + " minutos para que comienze el fin de semana.");
    }
  }
}
