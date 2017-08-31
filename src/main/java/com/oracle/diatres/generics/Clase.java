package com.oracle.diatres.generics;

public class Clase<T extends Integer> {
    
    private T objeto;
    
    public Clase(T objeto){
        this.objeto = objeto; 
   }

       public void mostrarTipo(){
           System.out.println("T es un: " + objeto.getClass().getName());
       }
    
}
