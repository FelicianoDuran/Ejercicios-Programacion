/**
 *
 * @author FeliciandoDuran
 */

import Matematicas.FuncionesMatematicas;
public class PruebaFunciones {

  public static void main(String[] args) {

    long x = Long.parseLong(System.console().readLine());
    int n = Integer.parseInt(System.console().readLine());

    
    System.out.println(Matematicas.FuncionesMatematicas.quitaPorDetras(x, n));
    
  }
}
