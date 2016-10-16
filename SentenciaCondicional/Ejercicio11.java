/**
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Feliciano Durán
 */
 public class Ejercicio11 {

    public static void main(String[] args) {
      
      System.out.print("Si quiere calcular cuantos segundos quedan para medianoche\n");
      System.out.print("Introduzca primero la hora y luego los minutos.\n");
      
      System.out.print("Horas: ");
      int horas = Integer.parseInt(System.console().readLine());
      
      System.out.print("minutos: ");
      int minutos = Integer.parseInt(System.console().readLine());
      
      int segundosActuales = (horas * 3600) + (minutos * 60);
      int segundosRestantes = (24 * 3600) - segundosActuales;
      
      System.out.print("Desde las " + horas + ":" + minutos + " hasta medianoche quedan " + segundosRestantes + " segundos");
      
    }
}
