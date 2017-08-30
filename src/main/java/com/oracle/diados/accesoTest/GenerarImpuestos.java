package com.oracle.diados.accesoTest;

import static com.oracle.diados.accesoTest.Impuestos.*;
import com.oracle.diados.empleados.Ingeniero;

public class GenerarImpuestos {
    
    public static void main(String[] args){
        
        Ingeniero salvador = new Ingeniero("Salvador", 20_000);
       
        System.out.println("Impuesto en MX : " + impuesto_mx);
        System.out.println("Impuesto de Salvador: " + calcularIVA(salvador.getSalary()));
        
        
        
        
        
    }
    
}
