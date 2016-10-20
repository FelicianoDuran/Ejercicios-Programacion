/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax 2 + bx + c = 0). 
 *
 * @author Feliciano Durán
 */
 public class Ejercicio09 {

    public static void main(String[] args) {
    System.out.print("Introduzca las variables a, b y c, para calcular la ecuación de segundo grado\n ax 2 + bx + c\n");
  
    System.out.print("a = ");
    double a = Double.parseDouble(System.console().readLine());
  
    System.out.print("b = ");
    double b = Double.parseDouble(System.console().readLine());
  
    System.out.print("c = ");
    double c = Double.parseDouble(System.console().readLine());
  
    if (a == 0) && (b != 0) && (c != 0){
      System.out.println("Se trata de una ecuación de primer grado")
      System.out.println("X1 = X2 =" + (-b/c));
      } else if }
    
    
    
    
    double X1 = (-b - (Math.sqrt(b*b - 4 * (a*c))))/ 2*a;
    double X2 = (-b + (Math.sqrt(b*b - 4 * (a*c))))/ 2*a;
    System.out.println("La solución de x1 es: " + X1);
    System.out.println("La solución de x1 es: " + X2);
  }
}
