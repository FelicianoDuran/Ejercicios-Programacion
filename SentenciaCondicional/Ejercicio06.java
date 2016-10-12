/**
 * calcule el tiempo que tardará en caer un objeto desde una altura H
 *
 * @author Feliciano Durán
 */
 public class Ejercicio06 {
  public static void main(String[] args) { 
    System.out.print("Introduzca la altura desde la que caerá el objeto\n");
    double h = Double.parseDouble(System.console().readLine());
    double g = 9.81;
    
    if (h >=0){
    double t = Math.sqrt((2*h)/g);
    System.out.print("La solucion es "+ t);
    } else { 
    System.out.print(" ERROR la solución es negativa");
  }
 }
}  
