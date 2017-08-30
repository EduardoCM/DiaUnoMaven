package com.oracle.diados.empleados;

import static com.oracle.diados.empleados.UtileriasEmpleado.getBono;
import static java.lang.System.out;

public class AsignarManager {
    
    public static void main(String[] args) {
        
      Empleado manager = new Manager("Gerardo", 10_000, "Arquitectura");
       out.println(manager.getNumeroEmpleado());
        
       
      Empleado inge = new Ingeniero("Saul", 10_000);
        out.println(inge.getNumeroEmpleado());
        
        
      Empleado manager2 = new Manager("Bety", 50_000, "Scrum"); 
        out.println(manager2.getNumeroEmpleado());
        
        
        Empleado.resetearNumeroEmpleado();
        
      Empleado manager3 = new Manager("Bety", 50_000, "Scrum"); 
      out.println(manager3.getNumeroEmpleado());
      
        Empleado manager4 = new Manager("Bety", 50_000, "Scrum"); 
        out.println(manager4.getNumeroEmpleado());
      
        
        
        
    }
    
}
