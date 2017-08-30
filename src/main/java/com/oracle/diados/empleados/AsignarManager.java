package com.oracle.diados.empleados;

import static com.oracle.diados.empleados.UtileriasEmpleado.getBono;

public class AsignarManager {
    
    public static void main(String[] args) {
        
        Manager manager = new Manager("Gerardo", 32, 10_000, "Arquitectura");
       
        Ingeniero inge = new Ingeniero("Saul", 45, 10_000);
        
        
        System.out.println(getBono(inge));
        
        System.out.println(getBono(manager));
        
        
    }
    
}
