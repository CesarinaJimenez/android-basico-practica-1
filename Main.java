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
public class Main {

    
    public static void main (String ...args){
        
        Estudiante[] estudiantes = {
            new Estudiante ("Juan", 24),
            new Estudiante ("Erica", 20),
            new Estudiante ("Emilio", 23),
            new Estudiante ("Karina", 21),
            new Estudiante ("Eduardo", 24),
            new Estudiante ("Tomás", 25)
        };
        
        int edadmin=estudiantes[0].getEdad();;
        int edadmax=0;
        int edadprom=0;
        int j=0;  
        //1.Total de estudiantes
        System.out.println("Total de estudiantes: " + estudiantes.length);
        
        //2. Edad mínima
        //3. Edad máxima
        //4. Edad promedio
        for (int i = 0; i < estudiantes.length; i++) {
            j=estudiantes[i].getEdad();
            if ( j > edadmax ) {
                edadmax=j;
            }
            if ( j < edadmin ) {
                edadmin=j;
            }    
            edadprom=edadprom+j;
        }
        
        edadprom=edadprom/estudiantes.length;
        
        System.out.println("Edad mínima: " + edadmin + " años | Edad máxima: " + edadmax + " años | Edad promedio: " + edadprom + " años.");
        
        //5. Imprimir todos los estudiantes
        System.out.println("Imprimir todos los estudiantes: ");

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i].getNombre() + " -> " + estudiantes[i].getEdad() + " años.");
        }
        //Fin
    }
    
}


  


