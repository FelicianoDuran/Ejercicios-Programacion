/**
 * Horario de Clase
 *
 * @author FelicianoD.
 */

public class Ejercicio05 {
  public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String gris = "\033[30m";
    String blanco = "\033[37m";

    System.out.println(naranja + "Lunes\tMartes\tMierc.\tJueves\tViernes");
    System.out.println("------\t------\t------\t------\t------");
    System.out.println(verde + "S.INF" + rojo + "\tPROG\tPROG" + azul + "\tB.D" + morado + "\tL.M");
    System.out.println(verde + "S.INF" + rojo + "\tPROG\tPROG" + azul + "\tB.D" + morado +"\tL.M");
    System.out.println(verde + "S.INF" + rojo + "\tPROG" + morado + "\tL.M" + azul + "\tB.D" + blanco + "\tE.D");
    System.out.println("RE      C        R       E       O");
    System.out.println(gris + "FOL" + azul + "\tB.D" + morado + "\tL.M" + rojo + "\tPROG" + verde + "\tS.INF");
    System.out.println(gris + "FOL" + azul + "\tB.D" + blanco + "\tE.D" + rojo + "\tPROG" + verde + "\tS.INF");
    System.out.println(gris + "FOL" + azul + "\tB.D" + blanco + "\tE.D" + rojo + "\tPROG" + verde + "\tS.INF");
  }
}
