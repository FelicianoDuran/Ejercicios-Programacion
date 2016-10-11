/**
 * Escriba por teclado el día de la semana 
 *
 * @author Feliciano Durán
 */
 public class Ejercicio01 {
  public static void main(String[] args) {  
    
    String dia;
    System.out.print("Introduzca un día de la semana para saber la primera asignatura:(L)(M)(X)(J)(V) ");
    dia = (System.console().readLine());
    dia.toLowerCase();
    
    
    switch (dia) {
    
    case "L":
      System.out.println("Sistemas informáticos");
      break;
    case "M":
      System.out.println("Programación");
      break;
    case "X":
      System.out.println("Programación");
      break;
    case "J":
      System.out.println("Base de datos");
      break;
    case "V":
      System.out.println("Lenguaje de marcas");
      break;
    default:
      dia = "Ha introducido mal el día";
    
    }
  }  
  
}
