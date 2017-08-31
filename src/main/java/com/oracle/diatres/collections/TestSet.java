package com.oracle.diatres.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    
    public static void main(String[] args) {
        Set<Persona> values = new HashSet<>();
        
        
        Persona p1 = new Persona("Raul", 25);
        Persona p2 = new Persona("Raul", 25);
        Persona p3 = new Persona("Raul", 25);
        Persona p4 = new Persona("Raul", 25);
        Persona p5 = new Persona("Jorge", 20);
        
        values.add(p1);
        values.add(p2);
        values.add(p3);
        values.add(p4);
        values.add(p5);
        
        System.out.println(values);
    }
    
}
