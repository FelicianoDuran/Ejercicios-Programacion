/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *  
 *
 * @author Feliciano Durán
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra por pantalla la media que tendrás que introducir de los 2 primeros\n");
    System.out.println("exámenes y dependiendo si estas aprobado o no, tendrás que poner (apto/noapto) de el \n");
    System.out.println("exámen de recuperación ");
    
    double Examen1 = Double.parseDouble(System.console().readLine());
    double Examen2 = Double.parseDouble(System.console().readLine());
    double NotaFinal = ((Examen1 + Examen2)/2);
    
     if (NotaFinal >= 5) {
       System.out.printl("Tu nota de los 2 exámenes es " + NotaFinal);
      } else {
        
