package com.oracle.diauno.test;

public class TestString {
    
    
    
    public static void main(String[] args) {
        
    String nombre = "Eduardo Castillo";
    String url;
    
    String nombres = "Eduardo Castillo, ";
    
    long time_inicio = System.nanoTime();   
    for(int x=0; x <=10_000; x++){
        nombres = nombres + ",";
    }
    long time_fin = System.nanoTime();
    double diferencia = (time_fin - time_inicio);
    
        System.out.println("String: " + diferencia);
   
   StringBuilder nombres2 = new StringBuilder("Eduardo Castillo, ");
    long time_inicio2 = System.nanoTime();    
   for(int x=0; x <=10_000; x++){
        nombres2 = nombres2.append(",").append("Otros nombres");
    }
    long time_fin2 = System.nanoTime();
    double diferencia2 = (time_fin2 - time_inicio2);
        
        System.out.println("String Builder" + diferencia2);
        
    }
    
}
