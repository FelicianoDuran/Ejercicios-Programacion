/**
 * 
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 *
 * @author Feliciano Durán
 */

public class Ejercicio10 {

    public static void main(String[] args) {
      
      
      System.out.print("Este programa nos dirá nuestro horoscopo a partir del dia y mes que introduzca");
      System.out.print("\nIntroduzca el número del mes en que nació 1 al 12: ");
      int mes = Integer.parseInt(System.console().readLine());
      
      System.out.print("Ahora introduzca el día: ");
      int dia = Integer.parseInt(System.console().readLine());
      
      switch(mes) {
        case 1:
          if (dia <=19) {
            System.out.print("Capricornio");
          } else {
            System.out.print("acuario");
          }
         break; 
        
        case 2:
          if (dia <=18) {
            System.out.print("acuario");
          } else {
            System.out.print("Piscis");
          }
        break; 
        
        case 3:
          if (dia <=20) {
            System.out.print("Piscis");
          } else {
            System.out.print("Aries");
          }
          break;
        
        case 4:
          if (dia <=20) {
          System.out.print("Aries");
          } else {
          System.out.print("tauro");
        }
          break;
          
        case 5:
          if (dia <=20) {
          System.out.print("Tauro");
          } else {
          System.out.print("Géminis");
        }
          break;
        
        case 6:
          if (dia <=22) {
          System.out.print("Géminis");
          } else {
          System.out.print("Cáncer");
        }
          break;
        
        case 7:
          if (dia <=22) {
          System.out.print("Cancer");
          } else {
          System.out.print("Leo");
        }
          break;
        
        case 8:
          if (dia <=19) {
          System.out.print("Leo");
          } else {
          System.out.print("Virgo");
        }
          break;
        
        case 9:
          if (dia <=22) {
          System.out.print("Virgo");
          } else {
          System.out.print("Libra");
        }
          break;
         
         case 10:
          if (dia <=23) {
          System.out.print("Libra");
          } else {
          System.out.print("Escorpio");
        }
          break;
         
         case 11:
          if (dia <=23) {
          System.out.print("Escorpio");
          } else {
          System.out.print("Sagitario");
        }
          break;
         
         case 12:
          if (dia <=21) {
          System.out.print("Sagitario");
          } else  {
          System.out.print("Capricornio");
          }
          break;
          
          default:
          System.out.println("Mes incorrecto");
    }
  }
}
          
          
          
          
