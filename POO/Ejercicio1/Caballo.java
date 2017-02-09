/**
 * 
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 *
 * @author Feliciano Durán Postigo
 */
public class Caballo {

    //ATRIBUTOS
    
    String sexo;
    String nombre;
    String color;
    double altura;
    double peso;
    
    // Constructor
    
    Caballo(String s, String c, String n, double a, double p) {
      this.sexo = s;
      this.color = c;
      this.nombre = n;
      this.altura = a;
      this.peso = p;
    }
    
    public String getNombre() {
    return this.nombre;
    }
    
    public String getSexo() {
    return this.sexo;
    }
    
    public String getColor() {
    return this.color;
    }
    
    public void relincha() {
    System.out.println("hiiiii hiiii ");
    }
    
  }
