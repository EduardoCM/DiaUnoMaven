package com.oracle.diacuatro.defaultmethods;

public interface PersonaB {
    
     default public void hablar(){
        System.out.println("Saludos desde Persona B");
    }
     
     
}
