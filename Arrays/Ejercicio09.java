/**
 * 
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 *
 * @author Feliciano Duran
 */
public class Ejercicio09 {
  public static void main(String[] args) {

  int[] numeroIntroducido = new int[8];
  int i = 0;
  
  System.out.prinln("Introduzca 8 números enteros para calcular cual es primo y cual no.");
  
    for(int i = 0; i < 8 ; i++){
      numeroIntroducido[i] = Integer.parseInt(System.console().readLine());
    }
    for(int i = 0; i < 8 ; i++){
      if (numeroIntroducido[i] % 2 == 0); {
       System.out.println(numeroIntroducido[i] + " es par");
      } else {
       System.out.println(numeroIntroducido[i] + "es impar");
      }
      
    }
  }
}
