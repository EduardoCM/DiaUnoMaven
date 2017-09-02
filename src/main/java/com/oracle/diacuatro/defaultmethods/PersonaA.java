package com.oracle.diacuatro.defaultmethods;

public interface PersonaA {
    
    public void caminar();
    
    default public void hablar(){
        System.out.println("Saludos desde Persona A");
    }
    
}
