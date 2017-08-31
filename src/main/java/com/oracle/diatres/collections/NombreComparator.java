package com.oracle.diatres.collections;

import java.util.Comparator;

public class NombreComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Persona per1 = (Persona)o1;
        Persona per2 = (Persona)o2;
        
        int result = 0;
        
        if(per1.getEdad() > per2.getEdad()){
            result = 1;
        }else if(per1.getEdad() < per2.getEdad()){
            result = -1;
        }else{
            result = 0;
        }
        
        return 0;
    }
    
    
    
}
