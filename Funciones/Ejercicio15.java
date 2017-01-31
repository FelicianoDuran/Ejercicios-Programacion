/**
 * 
 * Muestra los números primos que hay entre 1 y 1000.
 *
 * @author Feliciano Duran
 */
 
 import Matematicas.FuncionesMatematicas;
 
public class Ejercicio15 {

    public static void main(String[] args) {

    for(int i = 1; i < 1001; i++){
      if (Matematicas.FuncionesMatematicas.esPrimo(i)) {
          System.out.print(i + "  ");
        }
    }
  }
}
