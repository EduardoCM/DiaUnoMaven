package com.oracle.diados.empleados;

public class UtileriasEmpleado {
    
    
    public static double getBono(Empleado empleado){
        double bono = 0.0;
        
        if(empleado instanceof Ingeniero){
            bono = empleado.getSalary() * .20;
        }else if (empleado instanceof Manager){
            bono = empleado.getSalary() * .05;
        }
        
        return bono;
    }
    
}
