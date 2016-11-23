/**
 * 
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author Feliciano Duran
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    System.out.println("Este programa seleciona aleatoriamente una carta de una baraja española:");
    int cartas = (int)(Math.random()*10) +1; 
   
    switch(cartas) {
    case 8:
    System.out.print("Sota de ");
     break;
    case 9:
    System.out.print("Caballo de ");
     break;
    case 10: 
     System.out.print("Rey  de ");
     break;
    default:
    System.out.print(cartas + " de ");
    }
    
    int palo = (int)(Math.random()*4) +1; 
    switch(palo) {
    case 1:
    System.out.println("oro ");
     break;
    case 2:
    System.out.println("bastos");
     break;
    case 3:
    System.out.println("espadas");
     break;
    case 4: 
    System.out.println("copas ");
     break;
      
    }
    
    
  }
}
