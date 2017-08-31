package com.oracle.diatres.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericosTest {
    
    
    public static void main(String[] args) {
        
        
        GenericDAO<Alumno> alumnoDao = new GenericDAO<>();

          Alumno alumno = new Alumno();
                 
        alumnoDao.insert(alumno);
        
        
    }
}

class Persona {
    
}

class Profesor {
    
}

class Alumno {
    
}