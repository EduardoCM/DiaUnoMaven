/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.diatres.interfaces.service;

import com.oracle.diauno.test.Persona;

/**
 *
 * @author diCenter
 */
public interface PersonaService {
    
    public void insert(Persona p);
    public void update(Persona p);
    public Persona find(Persona p);
    public void delete(Persona p);
    
}
