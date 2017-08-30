package com.oracle.diados.accesoTest;

public class Impuestos {
    
    public static final double impuesto_mx = .16;
    public static final double impuesto_br = .20;
    
    
    public static double calcularIVA(double salary){
          return salary * impuesto_mx;
    }
    
}
