package com.oracle.diatres.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.AutoCloseable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CloseResource {
    
    public static void main(String[] args) throws FileNotFoundException {
     
         CloseResource.leerArchivos();
    }
    
    public static void leerArchivos() throws FileNotFoundException{
         System.out.println("Se abre un archivo:::: ");
        InputStream in = new FileInputStream("miTextooo.txt");
    }
    
}
