/**
 *
 *  Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 *  puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 *
 * @author Feliciano Durán
 */
public class Ejercicio19 {

  public static void main(String[] args) {
    System.out.print("Introduzca un número entero no superior a 5 dígitos para saber cuántos dígitos\n tiene, puede ser negativo o postivo => ");
     
     int n = Integer.parseInt(System.console().readLine());
      
      if (n<10 && n>-10){
        System.out.println("El número introducido tiene 1 dígito");
      
      } else if ((n>=10 && n<100) || (n<=-10 && n>-100)) {
         System.out.println("El número introducido tiene 2 digitos");
      
      } else if ((n>=100 && n<1000) || (n<=-100 && n>-1000)) { 
         System.out.println("El número introducido tiene 3 dígitos");
      
      } else if ((n>=1000 && n<10000) || (n<=-1000 && n>-10000)) {
         System.out.println("El número introducido tiene 4 dígitos");
      
      } else if ((n>=10000 && n<100000) || (n<=-10000 && n>-100000)) {
         System.out.println("El número introducido tiene 5 dígitos");
        
        } else {
          System.out.println("Ha introducido un número erroneo");
        }
  }      
}      
