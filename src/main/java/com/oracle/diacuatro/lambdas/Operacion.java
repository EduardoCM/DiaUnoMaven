package com.oracle.diacuatro.lambdas;

@FunctionalInterface
public interface Operacion {
    
    double calcularPromedio(double num1, double num2);
    
    
    
    default String OtraOperacion(String v1, String v2){
        return (v1 + v2).toUpperCase();
    }

}
