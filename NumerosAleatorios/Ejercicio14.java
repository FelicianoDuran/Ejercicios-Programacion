/**
 * 
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número
 * entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor
 * que el que te acaba de decir.
 *
 * @author Feliciano Duran
 */
public class Ejercicio14 {

  public static void main(String[] args) {

  int contador;
  int numeroIntroducido;
  
  System.out.println("Introduzca un numero y el programa tratará de acertar su número para ello debe contestar si el \n ");
  System.out.println("es mayor o menor al que has introducido: ");
  
  int numeroIntroducido = Integer.parseInt(System.console().readLine());
  
    
    for(contador = 5; contador >=0; contador --){
      n = (int)(Math.random()* 101);
      System.out.println("El numero es mayor que: " + n + "?");
      
    
  
