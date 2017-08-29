package com.oracle.diauno.test;

public class Persona {
    
    String nombre;
    
    String direccion;
    
    public static String getDirecciones(){
        StringBuilder direccionesHoteles = new StringBuilder("");       
        
        String directionestest = "direccion 0";
        directionestest += "direccion n";
        
       return direccionesHoteles.append("direccion1,").append("dereccion2").toString();
    }
    
    public static void main(String[] args) {
        
        System.out.println(getDirecciones());
    }
    
    
}
