/**
 *
 * Biblioteca de funciones matemáticas
 *
 * @author Feliciano Durán
 */
package Matematicas;


public class FuncionesMatematicas {
  
  /**
   * Le da la vuelta a un número.
   *
   * @param x número al que se le quiere dar la vuelta
   * @return  número volteado (al revés)
   * 
   */
  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
    }

    long volteado = 0;

    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }
  
  
  /** 
  * 
  * esCapicua: Devuelve verdadero si el número que se pasa como pará-
  * metro es capicúa y falso en caso contrario.
  * 
  * @param x el numero que se quiere comprobar
  * @return verdadero o falso
  * 
  */
  public static boolean esCapicua (int x){
    if(x == voltea(x)){
      return true;
    } else {
    return false;
    }
  }
  
  
  /**
   * 
   * esPrimo: Devuelve verdadero si el número que se pasa como parámetro
   * es primo y falso en caso contrario.
   * 
   * @param x es el nuero que se comprueba
   * @return Devuelve un booleano true en caso de que sea primo y false, si no lo es.
   * 
   */
   public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }
  
  /**
   * 
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   * 
   * @param x es un numero entero
   * @return El siguiente primo.
   * 
   */
   public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {
      };

    return x;
  }
  
   
   /**
   * Dada una base y un exponente, devuelve la potencia.
   *
   * @param base de la potencia
   * @param exponente exponente de la potencia
   * @return resutado de elevar la base al exponente
   */
   
    public static double potencia(long base, long exponente) {
    if (exponente == 0) {
      return 1;
    }

    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }

    long n = 1;

    for (long i = 0; i < Math.abs(exponente); i++) {
      n = n * base;
    }

    return n;
  }
  
  /**
   * Cuenta el número de dígitos de un número entero.
   *
   * @param x número al que se le quieren contar los dígitos.
   * @return  número de dígitos que tiene el número.
   */
  public static long digitos(long x) {
    if (x < 0) {
      x = -x;
    }

    if (x == 0) {
      return 1;
    } else {
      long n = 0;
      while (x > 0) {
        x = x / 10; // se va dividiendo entre 10 hasta que no se pueda mas
        n++; // n es el numero de digitos
      }
      return n;
    }
  }

   /**
   * Devuelve el dígito que está en la posición n de un número
   * entero. Se empieza contando por el 0 y de izquierda a derecha.
   *
   * @param x Numero entero introducido
   * @param n La posición en el numero
   *
   * @return devuelve la posición en el número 
   * 
   */
  public static long digitoIzquierdo(long x, int n) {
    
    n = n-1;
    
    x = voltea(x); // 487584, 485784.

    while (n-- > 0) {
      x = x / 10; //divide entre 10 el numero veces que hayas metido como parametro n.
    }
    return (int)x % 10; // devuelve el resto del número dividido.
  }
  
  
   
  /**
   * Devuelve el dígito que está en la posición n de un número
   * entero. Se empieza contando por el 0 y de izquierda a derecha.
   *
   * @param x Numero entero introducido
   * @param n La posición en el numero
   *
   * @return devuelve la posición en el número 
   * 
   */
  public static long posicionDeDigito(long x, int n) {
    
    n = n-1;
    
    x = voltea(x); // 487584, 485784.

    while (n-- > 0) {
      x = x / 10; //divide entre 10 el numero veces que hayas metido como parametro n.
    }
    return (int)x % 10; // devuelve el resto del número dividido.
  }
  
  
  /**
   * Le quita a un número n dígitos por detrás (por la
   * derecha).
   *
   * @param x Numero entero introducido.
   * @param n Resto posiciones al numero introducido.
   *
   * @return Devuelve el numero con las posicones restadas.
   * 
   */
  public static long quitaPorDetras(long x, int n) {
    
    while(n-- > 0){
      
      x = x/10;
    }
    
    return x;
  }
  
  
  
  
   /**
   * Le quita a un número n dígitos por delante (por la
   * izquierda).
   *
   * @param x Numero entero introducido.
   * @param n Resto posiciones al numero introducido.
   *
   * @return Devuelve el numero con las posciones restadas.
   * 
   */
  public static long quitaPorDelante(long x, int n) {
    
    x = voltea(quitaPorDetras(voltea(x), n));
    
    return x;
  }
  

    /**
   * 
   *  Añade un dígito a un número por delante.
   * 
   * @param x Numero entero introducido.
   * @param n digito que se le va a añadir por la izquierda.
   *
   * @return Devuelve el numero con el dígito añadido.
   * 
   */
  public static long pegaPorDelante(long x, int n) {
    
    return juntaNumeros(n, x);
    
  }
  
  
  /**
   * Pega dos números para formar uno solo.
   *
   * @param x trozo que se pegará por la izquierda
   * @param y trozo que se pegará por la derecha
   * @return  número compuesto de los trozos <code>x</code> e <code>y</code>
   */
  public static long juntaNumeros(long x, long n) {
    return (long)(x * potencia(10, digitos(n))) + n;
  }
  
  
   
   /**
   * 
   *  Añade un dígito a un número por detrás.
   * 
   * @param x Numero entero introducido.
   * @param n digito que se le va a añadir por la izquierda.
   *
   * @return Devuelve el numero con el dígito añadido.
   * 
   */
  public static long pegaPorDetras(long x, int n) {
    
    return juntaNumeros(x, n);
    
  }
  
  
  
  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   * <p>
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      número entero
   * @param inicio posición inicial
   * @param fin    posición final
   * @return       trozo de número compuesto por todos los dígitos que van desde
   *               la posición inicial a la posición final incluyendo ambos
   */
  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = (int)digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }
  
  
}

