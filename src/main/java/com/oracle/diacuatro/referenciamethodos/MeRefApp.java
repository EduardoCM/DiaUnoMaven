package com.oracle.diacuatro.referenciamethodos;

import java.util.Arrays;
import java.util.Comparator;

public class MeRefApp {
    
    public static void main(String args[]){
        MeRefApp.refConstructor();
    }
    
    public static void referenciaInstanciaMetodo(){
        String[] nombres = {"Erika", "Berenice", "Israel", "Adrian", "Alfredo"};
        
        /*
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
              return  o1.compareToIgnoreCase(o2);
            }
        });
        */
        
        //Arrays.sort(nombres, (s1, s2) -> s1.compareTo(s2));
        
        
        
        Arrays.sort(nombres, String::compareToIgnoreCase);
        
        
        for(String nombre: nombres){
            System.out.println(":: " + nombre);
        }
        
    }
    
    public static void refConstructor(){
        
        /*
        IPersona iper = new IPersona() {
            @Override
            public Persona crear(int id, String nombre) {
               return new Persona(id, nombre);
            }
        };
        
        IPersona iper = (int id, String nombre) -> (new Persona(id, nombre));  
        Persona p = iper.crear(1, "Juanita");
        System.out.println(p);
        */
        
        IPersona iper = Persona::new;
        Persona p = iper.crear(1, "Ramon");
        
        System.out.println(p);
        
        
    }
    
}
