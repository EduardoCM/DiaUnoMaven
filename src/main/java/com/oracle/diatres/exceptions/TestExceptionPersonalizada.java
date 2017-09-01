package com.oracle.diatres.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestExceptionPersonalizada {
    
    
    public static void main(String[] args) {
        
        try {
            System.out.println("Inicia");
            TestExceptionPersonalizada.buscarTerrorista();
        } catch (OracleException ex) {
            System.out.println(":::::::::::: FALO ::::::::::");
           ex.getMessage();
           ex.getCodigo();
           ex.getLinkSolucion();
        }
        System.out.println("Termina");
    }
    
    
    public static void buscarTerrorista() throws OracleException{
        String[] terroristas = {"Saul", "El Chapo", "Binladen"};
        
        for (String terrorista : terroristas) {
             if(terrorista.equalsIgnoreCase("Binladen")){
                 throw new OracleException("Se encontro un terrorista " + terrorista, "Terrorista Exception", 5000, "http://Confluente/5000/Solucion" );
             }
        }
        
    }
}
