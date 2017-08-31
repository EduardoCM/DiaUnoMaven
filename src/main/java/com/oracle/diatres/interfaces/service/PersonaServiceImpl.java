package com.oracle.diatres.interfaces.service;

import com.oracle.diatres.interfaces.dao.PersonaDAO;
import com.oracle.diatres.interfaces.dao.PersonaDAOImpl;
import com.oracle.diauno.test.Persona;


public class PersonaServiceImpl implements PersonaService{

    PersonaDAO personaDao;
    
    @Override
    public void insert(Persona p) {
       personaDao = new PersonaDAOImpl();
       personaDao.insert(p);
    }

    @Override
    public void update(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona find(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
