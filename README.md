# hello-world
//Estudiante.java
public class Estudiante{
  private String nombre;
  private int edad; 
  
  public Estudiante (String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public int getEdad() {
    return this.edad;
  }
  
  //Main.java
  
  public class Main {
    public static void (String ...args){
      Estudiante[] estudiantes = {
        new Estudiante ("Juan", 24),
        new Estudiante ("Erica", 20),
        new Estudiante ("Emilio", 23),
        new Estudiante ("Karina", 21),
        new Estudiante ("Eduardo", 24),
        new Estudiante ("Tomás", 25)
      };
    }
  }
  
  
  
