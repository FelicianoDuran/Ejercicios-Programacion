/**
 *
 * @author FeliciandoDuran
 */

import Matematicas.FuncionesMatematicas;
public class PruebaFunciones {

  public static void main(String[] args) {

    long x = Long.parseLong(System.console().readLine());
    int inicio = Integer.parseInt(System.console().readLine());
    int fin = Integer.parseInt(System.console().readLine());
    
    System.out.println(Matematicas.FuncionesMatematicas.trozoDeNumero(x, inicio, fin));
    
  }
}
