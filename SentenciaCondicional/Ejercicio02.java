/**
 * Realiza un programa que pida una hora por teclado y que muestre luego
 *  buenos días, buenas tardes o buenas noches según la hora
 *
 * @author Feliciano Durán
 */

public class Ejercicio02 {
  public static void main(String[] args) {
    
    System.out.println("Introduzca la hora para ser saludado");
    
    double hora = Double.parseDouble(System.console().readLine());
     if (hora >=6 && hora <=12){
       System.out.println("Buenos días");
       
       } else if (hora >=13 && hora <=20) {
          System.out.println("Buenas tardes");
          
         } else if ((hora >=21 && hora <=0) || (hora >=0 && hora <=5)) {
            System.out.println("Buenas noches");
          
          } else {
            System.out.println("La hora que ha introducido es incorrecta");
			
    }
       
  }
}
