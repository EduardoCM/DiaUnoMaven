package com.oracle.diados.empleados;

import java.util.Objects;

public class Manager extends Empleado {
    
    private String nameDpt;
    
   public Manager(String nombre, double salary, String nameDpt) {
        super(nombre, salary);
        this.nameDpt = nameDpt;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " Nombre Departamento: " + this.nameDpt;
      
    }

    @Override
    public double getBonusPercent(Empleado empleado) {
       return empleado.getSalary() * .15;
    }

  
    @Override
    public boolean equals(Object obj) {
       boolean result = false;
       
       if((obj != null) && (obj instanceof Manager) ){
           Manager manager = (Manager)obj;
           if (manager.getNombre().equalsIgnoreCase(this.getNombre()) &&
               manager.getNumeroEmpleado() == this.getNumeroEmpleado() && 
               manager.getSalary() == this.getSalary() &&
               manager.nameDpt.equalsIgnoreCase(this.nameDpt)){
               result = true;
           }
       }
       return result;
    }
    
    
    
    
}
