/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *  
 *
 * @author Feliciano Durán
 */
public class Ejercicio20 {

  public static void main(String[] args) {
    System.out.println("Este programa funciona de modo que si introduzce un número le detectará si es capicúa o no");
    System.out.print("Introzuca ahora su número = ");
     int numero = Integer.parseInt(System.console().readLine());
      if (numero<10){
        System.out.println("Su número es capicúo");
        
      } else if ((numero>=10) && (numero<100)) {
        if((numero%10) == (numero/10)) {
         System.out.println("Su número es capicúo");
      
        } else {
         System.out.println("Su número no es capicúo");
        }

      } else if ((numero>=100) && (numero<1000)) {
        if ((numero%10) == (numero/100)) {
         System.out.println("Su número es capicúo");
         
        } else {
           System.out.println("Su número no es capicúo");
        }
         
      } else if ((numero>=1000) && (numero<10000)) {
        if ((numero%10) == (numero/1000)) {
         System.out.println("Su número es capicúo");
         
        } else {
           System.out.println("Su número no es capicúo");
        }
        
      } else if ((numero>=10000) && (numero<100000)) {
        if ((numero%10) == (numero/10000)) {
         System.out.println("Su número es capicúo");
         
        } else {
           System.out.println("Su número no es capicúo");
        } 
        
      } else {
         System.out.println("Ese número numero es erroneo");
        }
        
    }
  }        
