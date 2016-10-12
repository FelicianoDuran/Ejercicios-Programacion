/**
 * Realiza un programa que calcule la media de 3 notas 
 *
 * @author Feliciano Durán
 */
 public class Ejercicio07 {

  public static void main(String[] args) {
     
    System.out.println("Introduzca su primera nota: ");
    Double PrimeraNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la segunda nota: ");
    Double SegundaNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la tercera nota: ");
    Double TerceraNota = Double.parseDouble(System.console().readLine());
    double media = (PrimeraNota + SegundaNota + TerceraNota) / 3;
    System.out.printf("La media es ", media);
  
  }
}
