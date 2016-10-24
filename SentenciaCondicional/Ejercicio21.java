/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *  
 *
 * @author Feliciano Durán
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    
    String recuperacion;
    
    System.out.println("Este programa muestra por pantalla la media que tendrás que introducir de los 2 primeros exámenes y dependiendo si estas aprobado o no, tendrás que poner (apto/noapto) de el exámen de recuperación");
    System.out.print("Introduzca la nota del primer examen = ");
    double Examen1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la nota del segundo examen = ");
    double Examen2 = Double.parseDouble(System.console().readLine());
    double NotaFinal = ((Examen1 + Examen2)/2);
     
     if (NotaFinal >= 5) {
       System.out.println("Tu nota de los 2 exámenes es " + NotaFinal);
      } else {
        System.out.println("Ahora en introduzca si has aprobado la recuperación o no (apto/noapto)");
           recuperacion = System.console().readLine();
           if (recuperacion.equals("apto")) {
           System.out.println("Enhorabuena, has aprobado la asignatura con un 5");
            } else {
              System.out.println("Tu nota sigue siendo " + NotaFinal + ",¡mas suerte la próxima vez!");
            }
      }   
        
  }
}
