/**
 * 
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
 * ducido es menor o mayor que el número secreto.
 *
 * @author Feliciano Duran
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    
    int contador;
    int numeroIntroducido = 0;
    int aux;
    int n = 0;
    boolean numAleatorio = false;
    
    System.out.println("Este programa piensa un numero de 0 a 100. \nTienes 5 oportunidades para adivinarlo ");
    
    n = (int)(Math.random()* 101);
    for(contador = 5; contador >=0; contador --){
      
      if(numAleatorio == false){
      
      System.out.print("Introduzca un número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
        if(numeroIntroducido < n){
          System.out.println("El numero que ha introducido es mayor, te quedan: "+ contador + " intentos");
        } else if (numeroIntroducido >n) {
          System.out.println("El numero que ha introducido es menor, te quedan: "+ contador + " intentos");
        }
      }
      if(numeroIntroducido == n){
        numAleatorio = true;
      }
    }
    if(numAleatorio){
      System.out.println("¡Enhorabuena, has acertado!");
    }
  }
}
