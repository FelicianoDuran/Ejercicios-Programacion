/**
 * 
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
 * ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 *
 * @author Feliciano Duran
 */
public class Ejercicio16 {

  public static void main(String[] args) {
  
    System.out.println("¡Bienvenido a la máquina del dinero facil!");
    System.out.println("Inserte una moneda para comenzar la partida");
    System.out.println("Tienes 3 intentos, el juego se acabará cuando se quede sin intentos");
    System.out.println("_____________________________________________");
    System.out.println("");
    System.out.println("🍋 (limon)");
    System.out.println("Ω (herradura)");
    System.out.println("💚 (corazón)");
    System.out.println("🔔 (campana)");
    System.out.println("💎 (diamante)");
    
    
    int monedas = 3; 
    int figuras = 0;
    int comparaFigura1 = 0; 
    int comparaFigura2 = 0;
    int comparaFigura3 = 0;
    int i = 0;
    String stringFiguras = (" ");
        
    do {
      System.out.println("\nPulse INTRO para jugar");
      System.out.println("Monedas: " + monedas);
      System.console().readLine();
      monedas--;
      
      for (i = 1; i <= 3; i++) { //saca los 3 "iconos"
        figuras = (int)(Math.random()*5) + 1;
        
        switch (figuras) {
          case 1:
          stringFiguras = ("💚");
          break;
          case 2:
          stringFiguras = ("💎");
          break;
          
          case 3:
          stringFiguras = ("Ω");
          break;
          
          case 4:
          stringFiguras = ("🔔");
          break;
          
          case 5:
          stringFiguras = ("🍋");
          break;
          
          default:
        } //switch figuras 
        
        
        System.out.printf(" ");
        System.out.print("| " + stringFiguras + " | "); //imprime por pantalla la figura
        
        switch (i) { //modificamos el valor de las variables para posteriormente compararlas entre ellas
        case 1:
        comparaFigura1 = figuras;
        break;
        
        case 2:
        comparaFigura2 = figuras;
        break;
        
        case 3:
        comparaFigura3 = figuras;
        break;
        default:
      } 
    }
      
      
     if (comparaFigura1 == comparaFigura2 && comparaFigura1 == comparaFigura3 && comparaFigura2 == comparaFigura3) {
        System.out.println("\n¡Enhorabuena! Ha ganado 10 monedas.");
        monedas +=10;
        i = 1;
      } else if (comparaFigura2 == comparaFigura3) {
        System.out.println("\n¡Bien! Ha recuperado su moneda.");
        monedas++;
        i = 1;
      } else if (comparaFigura3 == comparaFigura2) {
        System.out.println("\n¡Bien! Ha recuperado su moneda.");
        monedas++;
        i = 1;
      } else if (comparaFigura1 == comparaFigura2 || comparaFigura1 == comparaFigura3) {
        System.out.println("\n¡Bien! Ha recuperado su moneda.");
        monedas++;
        i = 1;
      } else {
        
      }
      
    } while (monedas > 0);
    
    System.out.println("\n¡Ha perdido! Introduzca una moneda para volver a empezar.");
    
  }
}
