/**
 * 
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 *
 * @author Feliciano Duran Postigo
 */
public class Ejercicio14 {
  public static void main(String[] args) {

    String[] color = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
    };

    String[] palabra = new String[8];
    String[] resultado = new String[8];

    System.out.println("Introduzca 8 palabras (vaya pulsando [INTRO] entre una y otra.");
    
    int j = 0;
    
    for (int i = 0; i < 8; i++) {
      palabra[i] = System.console().readLine();

      // 
      for (String c : color) {
        if (palabra[i].equals(c)) {
          resultado[j++] = c;
        }
      }
    }

    // 
    for (int i = 0; i < 8; i++) {
      boolean esColor = false;

      for (String c : color) {
        if (palabra[i].equals(c)) {
          esColor = true;
        }
      }

      if (!esColor) {
        resultado[j++] = palabra[i];
      }
    }

    System.out.printf("ARRAY ORIGINAL\n");
    for (int i = 0; i < 8; i++) {
      System.out.println("palabras[" + i + "]: " + palabra[i]);
    }
    System.out.println("");
    System.out.printf("ARRAY ORDENADO\n");
    for (int i = 0; i < 8; i++) {
      System.out.println("palabras2[" + i + "]: " + resultado[i]);
    
    } //for
  

  }
}
