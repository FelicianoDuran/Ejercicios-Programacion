/**
 * Escriba por teclado un número del 1 al 7 para conoces el día de la semana al que corresponde 
 *
 * @author Feliciano Durán
 */
 public class Ejercicio03 {
  public static void main(String[] args) { 
    
   System.out.print("Introduzca un número del 1 al 7 para saber a que día de la semana corresponde\n");
   String numero;
   numero = (System.console().readLine());
   numero.toLowerCase();
   
   switch (numero) {
      case "1":
        System.out.println("Lunes");
        break;
      case "2":
        System.out.println("Martes");
        break;
      case "3":
        System.out.println("Miercoles");
        break;
     case "4":
        System.out.println("Jueves");
        break;
     case "5":
        System.out.println("Viernes");
        break;
     case "6":
        System.out.println("Sábado");
        break;
     case "7":
        System.out.println("Domingo");
        break;
        
        
        
     
    }
  } 
}
