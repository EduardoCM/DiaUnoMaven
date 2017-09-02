package com.oracle.diacuatro.defaultmethods;

public class TestDefault implements PersonaA, PersonaB{

    @Override
    public void caminar() {
           System.out.println("Implementación de caminar");
    }
    
    @Override
    public void hablar(){
        PersonaA.super.hablar();
    }
    
    public static void main(String[] args) {
        
        TestDefault test = new TestDefault();
        test.caminar();
        test.hablar();    
    }
}
