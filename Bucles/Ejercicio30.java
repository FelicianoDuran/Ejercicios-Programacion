/**
 * 
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 * 
 * @author Feliciano Duran
 */
import java.util.Scanner;
 public class Ejercicio30 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.print("\n Este programa calcula las horas transcurridas entre dos horas");
    System.out.println(" de dos días a la semana (no se tendrá en cuenta ni los minutos ni los segundos).");
    System.out.println("_________________________________________________________________________________");
    
    String nombreDiaScanner;
    String nombreDiaScanner2;
    int horaDia1;
    int horaDia2;
    String nombreDia1 = "";
    String nombreDia2 = "";
    int numeroDia1;
    int numeroDia2;
    boolean esCorrecto = true; 
    
    // Iteramos la recogida de datos mientras haya datos introducidos incorrectos
    do {
      
      
      System.out.print("\nPor favor, introduzca el primer día ('Lunes', 'Martes'.. o, (1, 2..): ");
      nombreDiaScanner = s.nextLine().toUpperCase();
      
      switch (nombreDiaScanner) {
        
        case "lunes":
        case "1":
          numeroDia1 = 1;
          nombreDia1 = "lunes";
          break;
        
        case "martes":
        case "2":
          numeroDia1 = 2;
          nombreDia1 = "martes";
          break;
        
        case "miercoles":
        case "3":
          numeroDia1 = 3;
          nombreDia1 = "miercoles";
          break;
        
        case "jueves":
        case "4":
          numeroDia1 = 4;
          nombreDia1 = "jueves";
          break;
        
        case "viernes":
        case "5":
          numeroDia1 = 5;
          nombreDia1 = "viernes";
          break;
        
        case "sabado":
        case "6":
          numeroDia1 = 6;
          nombreDia1 = "sabado";
          break;
          
        case "domingo":
        case "7":
          numeroDia1 = 7;
          nombreDia1 = "domingo";
          break;
        default: 
          numeroDia1 = 0;
      }
        
      System.out.print("Hora: ");
      horaDia1 = Integer.parseInt(s.nextLine());
      
      System.out.print("\nAhora introduzca el segundo día: ");
      nombreDiaScanner2 = s.nextLine().toUpperCase();
      
      switch (nombreDiaScanner2) {
        
        case "lunes":
        case "1":
          numeroDia2 = 1;
          nombreDia2 = "lunes";
          break;
        
        case "martes":
        case "2":
          numeroDia2 = 2;
          nombreDia2 = "martes";
          break;
        
        case "miercoles":
        case "3":
          numeroDia2 = 3;
          nombreDia2 = "miércoles";
          break;
        
        case "jueves":
        case "4":
          numeroDia2 = 4;
          nombreDia2 = "jueves";
          break;
        
        case "viernes":
        case "5":
          numeroDia2 = 5;
          nombreDia2 = "viernes";
          break;
        
        case "sabado":
        case "6":
          numeroDia2 = 6;
          nombreDia2 = "sabado";
          break;
        
        case "domingo":
        case "7":
          numeroDia2 = 7;
          nombreDia2 = "domingo";
          break;
        default: 
          numeroDia2 = 0;
      }
    
      System.out.print("Hora: ");
      horaDia2 = Integer.parseInt(s.nextLine());
      
      // Se verifica si lo introducido es correcto o incorrecto
      esCorrecto = true;
      
      // Comprueba si el día introducido es erróneo
      if ((numeroDia1 == 0) || (numeroDia2 == 0)) {
        esCorrecto = false;
        System.out.println("\nLo siento, ha introducido un día no válido.");
      }
      
      // Comprueba si el segundo día es el mismo o va antes del primero 
      if(numeroDia2 <= numeroDia1) {
        esCorrecto = false;
        System.out.println("\n¡Error!, el segundo día no puede ser igual o anterior al primero.");
      }
      
      // Comprueba si la hora es correcta
      if ((horaDia1 < 0) || (horaDia1 > 23) || (horaDia2 < 0) || (horaDia2 > 23)) {
        esCorrecto = false;
        System.out.println("\n La hora introducida no es correcta.");
      }
    } while (!esCorrecto);
    
    // Mostramos los resultados por pantalla
    System.out.println("________________________________________________________________________________");
    System.out.print("\nEntre las " + horaDia1 + ":00 del " + nombreDia1 + " y, las " + horaDia2 + ":00");
    System.out.print(" del " + nombreDia2 + " hay " + ((24*numeroDia2 + horaDia2) - (24*numeroDia1 + horaDia1)));
    System.out.println(" hora/s.");
  }
}
