/**
 *  Sentencia Condicional
 *
 *  Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author FeliciandoDuran
 */
public class Ejercicio13 {

  public static void main(String[] args) {

    int a;
    int b;
    int c;
    
    System.out.print("Introduzca 3 números por teclado y se ordenarán consecutivamente");
    System.out.print("A continución introduzca el primer número: ");
    a = Integer.parseInt(System.console().readLine());
    
    System.out.print("A continución introduzca el segundo número: ");
    b = Integer.parseInt(System.console().readLine());
    
    System.out.print("A continución introduzca el tercer número: ");
    c = Integer.parseInt(System.console().readLine());
    
    if (a>b&&a>c) {
      if (b>c) {
        System.out.print( a + " -> " + b + " -> " + c);
      } else {
        System.out.print( a + " -> " + c + " -> " + b);
      }  
      
       } else if(b>a&&b>c) {
        if (a>c) {
         System.out.print( b + " -> " + a + " -> " + c);
        } else {
          System.out.print( b + " -> " + c + " -> " + a);
        }  
       } else if(c>a&&c>b) {
        if (a>b) {
         System.out.print( c + " -> " + a + " -> " + b);
        } else {
          System.out.print( c + " -> " + b + " -> " + a);
         }
      }
      
   }   
 }
 
