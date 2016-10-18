/**
 *     Sentencia Condicional
 *
 *     Realiza un minicuestionario con 10 preguntas tipo test sobre las
 *     asignaturas que se imparten en el curso. Cada pregunta acertada
 *     sumará un punto. El programa mostrará al final la califcación
 *     obtenida. Pásale el minicuestionario a tus compañeros y pídeles
 *     que lo hagan para ver qué tal andan de conocimientos en las
 *     diferentes asignaturas del curso.
 *
 * @author Feliciano Durán
 */
public class  Ejercicio12 {

  public static void main(String[] args) {

      int puntos = 0;
      String solucion;
      System.out.println(" CUESTIONARIO TIPO TEST 1º DAW");
      
      System.out.println("Para relizar dicho cuestionario debe responder con A / B / C");
      
      System.out.println("1. ¿Con que comando muestras el actual contenido del directorio en el sistema?");
      System.out.println("A ->LS");
      System.out.println("B ->CD");
      System.out.println("C ->MKDIR");
      System.out.println("--------------------");
      System.out.print(" → ");
      solucion = System.console().readLine();
       if (solucion.equals("A")); {
        puntos++;
      }
      
      System.out.println("2. ¿Para que sirve el comando mv?");
      System.out.println("A -> Mover o renombrar archivos");
      System.out.println("B -> Borrar archivos");
      System.out.println("C -> Copiar archivos");
      System.out.println("--------------------");
      System.out.print(" → ");
      solucion = System.console().readLine();
       if (solucion.equals("A")) {
        puntos++;
      }
      
      
      System.out.println("3. Si tras teclear cd en el sistema ponemos el carater / significa que es una ruta..");
      System.out.println("A ->Relativa");
      System.out.println("B ->Absoluta");
      System.out.print(" = ");
      solucion = System.console().readLine();
       if (solucion.equals("B")); {
        puntos++;
      }
     
      System.out.println("4. ¿Para que sirve el comando  tail");
      System.out.println("A -> Muestra las últimas lineas de un archivo");
      System.out.println("B -> Abre el contenido de un archivo");
      System.out.println("C -> Muestra las primeras lineas de un archivo");
      System.out.println("--------------------");
      System.out.print(" → ");
      solucion = System.console().readLine();
       if (solucion.equals("A")) {
        puntos++;
      }
      
      System.out.println("5. ¿Que indica el operador ||");
      System.out.println("A -> O");
      System.out.println("B -> Y");
      System.out.println("C -> no");
      System.out.println("--------------------");
      System.out.print(" → ");
      solucion = System.console().readLine();
       if (solucion.equals("A")) {
        puntos++;
      }
      
      System.out.println("6. ¿Como conseguimos actualizar un repositorio en local?");
      System.out.println("A -> .gitignore");
      System.out.println("B -> git clone");
      System.out.println("C -> git pull");
      System.out.println("--------------------");
      System.out.print(" → ");
      solucion = System.console().readLine();
       if (solucion.equals("C")) {
        puntos++;
      }
      
      System.out.println("7. ¿Cuantos mas transistores se incluyan en el núcleo  del procesador.. ");
      System.out.println("A -> Podemos incluir mas unidades funcionales ");
      System.out.println("B -> Aumenta el coste de fabricacion");
      System.out.println("C -> Disminuye la velocidad de procesos");
      System.out.println("--------------------");
      System.out.print(" → ");
      solucion = System.console().readLine();
       if (solucion.equals("A")) {
        puntos++;
      }

      System.out.println("8. ¿Que modo de acceso a fichero acceder al primer registro del archivo y después a todos los sucesivos?");
      System.out.println("A -> Acceso directo");
      System.out.println("B -> Acceso secuencial");
      System.out.println("--------------------");
      System.out.print(" → ");
      solucion = System.console().readLine();
       if (solucion.equals("B")) {
        puntos++;
      }
      
      System.out.println("9. ¿Cual de los siguientes formato esta escrito en lowerCamelCase ");
      System.out.println("A -> programandoEnJava ");
      System.out.println("B -> programandoEnjava ");
      System.out.println("C -> ProgramandoEnJava ");
      System.out.println("--------------------");
      System.out.print(" → ");
      solucion = System.console().readLine();
       if (solucion.equals("A")) {
        puntos++;
      }
      
      
      System.out.println("10. ¿Que ocurre si ponemos rm -Rf multimedia_copia/ ");
      System.out.println("A -> No se puede borrar porque es un directorio ");
      System.out.println("B -> Antes de eliminar el directorio te pregunta (s/n) ");
      System.out.println("C -> Eliminar el directorio sin preguntarte antes ");
      System.out.println("--------------------");
      System.out.print(" → ");
      solucion = System.console().readLine();
       if (solucion.equals("C")) {
        puntos++;
       }
      
      
   System.out.println("  Ha obtenido " + puntos + " puntos.");
   } 
  } 
   
   
