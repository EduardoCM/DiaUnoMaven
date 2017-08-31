package com.oracle.diatres.clasesAnonimas;

public class Bienvenida {
    
    public Bienvenida(){        
    }
    
    public void init(){    
        /*
        Saludar saludo = new Saludar("Eduardo Castillo");
        saludo.saludar();
        saludo.despedirse();
        */
        
        Saludador saludador = new Saludador() 
        {
            @Override
            public void saludar() {
                System.out.println("Hola Desde Mi interface interna");
            }

            @Override
            public void despedirse() {
                System.out.println("Hola Desde Mi clase anonima ");
            }
        };
        
        saludador.saludar();
        saludador.despedirse();
        
        
    }
    
    
    
    
    private class Saludar{
        String nombre;
        
        public Saludar(String s){
            nombre = s;
        }
        
        public void saludar(){
            System.out.println("Hola: " + nombre);
        }
        
        public void despedirse(){
            System.out.println("Adios: " + nombre);
        }
    }
    
    private interface Saludador{
     
        public void saludar();
        public void despedirse();
    
    }
    
}
