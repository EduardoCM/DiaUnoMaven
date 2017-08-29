package com.oracle.diauno.arreglos;

public class ArregloExplicito {
    
    public static void main(String[] args) {
        double [] valores = new double[5];
        
        for(int i=0; i < valores.length; i++){
            valores[i] = i;
        }
        double promedio = 0.0;
        
        for (double valor : valores) {
            promedio = promedio + valor;
        }
        
        System.out.println(promedio/valores.length);
        
    }
    
}
