package com.oracle.diatres.wildCards;

import java.util.ArrayList;
import java.util.List;

public class TestWildCard {
    
    public void listar(List<? extends Persona> lista){
       
        for (Persona persona : lista) {
            System.out.println(persona.getName());
        }
        
        
        /*
        for (Object obj : lista) {
            if(obj instanceof Alumno){
               System.out.println( ((Alumno)obj).getName());
            }else if(obj instanceof Profesor){
                System.out.println( ((Profesor)obj).getName());
            }
        }
       */
    }
    
    public static void main(String[] args) {
        TestWildCard test = new TestWildCard();
        
        Alumno al1 = new Alumno("Erika");
        Alumno al2 = new Alumno("Alfredo");
        Alumno al3 = new Alumno("Israel");
        
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(al1);
        alumnos.add(al2);
        alumnos.add(al3);
        
        test.listar(alumnos);
        
        Profesor profe1 = new Profesor("Tesla");
        Profesor profe2 = new Profesor("Einstein");
        Profesor profe3 = new Profesor("Edison");
        
        List<Profesor> profesores = new ArrayList<>();
        profesores.add(profe1);
        profesores.add(profe2);
        profesores.add(profe3);
        
        test.listar(profesores);
        
        
    }
    
}
