package com.oracle.diatres.interfaces.dao;

import com.oracle.diauno.test.Persona;
import java.sql.Connection;

public interface PersonaDAO {
    
    String url = "http:77asd-asd.com";
    
    void insert(Persona p);
    void update(Persona p);
    Persona find(Persona p);
    void delete(Persona p);
    
    
}
