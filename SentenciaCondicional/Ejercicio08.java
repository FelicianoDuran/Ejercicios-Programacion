/**
 * Realiza un programa que calcule la media de 3 notas 
 *
 * @author Feliciano Durán
 */
 public class Ejercicio08 {

  public static void main(String[] args) {
     
    System.out.println("Introduzca su primera nota: ");
    Double PrimeraNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la segunda nota: ");
    Double SegundaNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la tercera nota: ");
    Double TerceraNota = Double.parseDouble(System.console().readLine());
    double media = (PrimeraNota + SegundaNota + TerceraNota) / 3;
    System.out.printf("La media es ", media);
    
    if (media < 5){
       System.out.println("Insuficiente");
    
    } else if (media >= 5 && media < 6) {
          System.out.println("Suficiente");
    
    } else if (media >= 6 && media < 7) {
          System.out.println("Bien");
          
    } else if (media >=7 && media < 9) {
          System.out.println("Notable");
          
    } else if (media >=9 && media <= 10) {
          System.out.println("Sobresaliente");
  
  }
  }
}
