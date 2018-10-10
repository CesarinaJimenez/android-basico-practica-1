/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursobasicoandroidpractica1;

/**
 *
 * @author cejimenez
 */
public class Estudiante {

    //Propiedades
    private String nombre;
    private int edad; 
    
    //Constructor
    public Estudiante (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
  
    
    //Métodos - getters&setters
    public String getNombre() {
        return this.nombre;
    }
  
    public int getEdad() {
        return this.edad;
    }

       
}



  
  

