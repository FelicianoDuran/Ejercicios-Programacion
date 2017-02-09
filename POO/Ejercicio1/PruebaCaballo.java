/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * @author Feliciano Durán Postigo
 */

public class PruebaCaballo {
  public static void main(String[] args) {
    
    Caballo uno = new Caballo("Caballo", "marron", "Agro", 1.70, 180);
    Caballo dos = new Caballo("Yegua", "gris", "Kalifa", 1.50, 150);
    
    System.out.println("Hola, me llamo " + uno.getNombre() + ", sexo: " + uno.getSexo() + ", color: " + uno.getColor()); 
    uno.relincha();
    System.out.println("Hola, me llamo " + dos.getNombre() + ", sexo: " + dos.getSexo() + ", color: " + dos.getColor());
    
  }
}
