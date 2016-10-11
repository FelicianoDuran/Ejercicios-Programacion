/**
 * Escriba por teclado el día de la semana 
 *
 * @author Feliciano Durán
 */
 public class Ejercicio05 {
  public static void main(String[] args) {
  
    System.out.print("Vamos a resulver la ecuación de primer grado ax + b = 0\n");
    System.out.print("Introduzca un número para el valor de a\n");
    int a = Integer.parseInt(System.console().readLine());
  
    System.out.print("Introduzca un número para el valor de b\n");
    int b = Integer.parseInt(System.console().readLine());
  
    double x = -(b)/a;

    System.out.print("Para un valor de a= " + a + " y b= " + b + " la ecuacion nos da un valor de x: " + x);
  }
}
