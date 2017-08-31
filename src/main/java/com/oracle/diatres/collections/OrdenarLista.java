package com.oracle.diatres.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarLista {
    
    public static void main(String args[]){
    
        List<Persona> lstPersonas = new ArrayList<>();
        
        lstPersonas.add(new Persona("Yolanda", 25));
        lstPersonas.add(new Persona("Alan", 27));
        lstPersonas.add(new Persona("Saul", 85));
        
        
        Collections.sort(lstPersonas);
        
        for (Persona lstPersona : lstPersonas) {
            System.out.println(":: " + lstPersona);
        }
        
    }
    
}
