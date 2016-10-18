/**
 *     Escribe un programa que pinte una pirámide rellena con un carácter
 *     introducido por teclado que podrá ser una letra, un número o un
 *     símbolo como *, +, -, $, &, etc. El programa debe permitir al
 *     usuario mediante un menú elegir si el vértice de la pirámide está
 *     apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
 *     derecha.
 *
 * @author Feliciano Durán
 */
public class Ejercicio15 {
  
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra una pirámide");
    System.out.println("Introduzca ahora un caracter para formar la piramide");
    String x = System.console().readLine();
    
    System.out.println("Elige el modelo de la piramide");
    System.out.println("1  Con el vértice hacia arriba");
		System.out.println("2  Con el vértice hacia abajo");
		System.out.println("3  Con el vértice hacia la izquierda");
		System.out.println("4  Con el vértice hacia la derecha");
    
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch(opcion) {
      case 1:
        System.out.println("   " + x );
        System.out.println("  " + x + x + x);
        System.out.println(" " + x + x + x+ x);
        System.out.println(x + x + x + x + x + x);
        break;
			case 2:
        System.out.println(x + x + x + x + x + x);
        System.out.println(" " + x + x + x + x);
        System.out.println("  " + x + x);
        System.out.println("   " + x);
        break;
			case 3:
        System.out.println("    " + x);
        System.out.println("  " + x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println("  " + x + " " + x);
        System.out.println("    " + x);
        break;
			case 4:
        System.out.println(x);
        System.out.println(x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println(x + " " + x);
        System.out.println(x);
        break;
      default:
		}
	}
}
