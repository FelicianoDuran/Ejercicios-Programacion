/**
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * 
 * @author Feliciano Duran
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    System.out.println("Este programa seleciona aleatoriamente una carta de entre toda la baraja:");
    int cartas = (int)(Math.random()*13) +1; 
   
    switch(cartas) {
    case 1:
    System.out.print("A de ");
     break;
    case 11:
    System.out.print("J de ");
     break;
    case 12:
    System.out.print("Q de ");
     break;
    case 13: 
     System.out.print("K de ");
     break;
    default:
    System.out.print(cartas + " de ");
    }
    
    int palo = (int)(Math.random()*4) +1; 
    switch(palo) {
    case 1:
    System.out.println("picas");
     break;
    case 2:
    System.out.println("corazones");
     break;
    case 3:
    System.out.println("diamantes");
     break;
    case 4: 
    System.out.println("tréboles");
     break;
      
    }
    
    
  }
}
     
