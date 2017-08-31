package com.oracle.diatres.interfaces.dao;

import com.oracle.diauno.test.Persona;
import java.sql.Connection;

public class PersonaDAOImpl implements PersonaDAO{

 
    @Override
    public void insert(Persona p) {
        System.out.println("Insert " + p);
    }

    @Override
    public void update(Persona p) {
    
    }

    @Override
    public Persona find(Persona p) {
       return new Persona();
    }

    @Override
    public void delete(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
