package com.oracle.diados.empleados;

public class Manager extends Empleado {
    
    private String nameDpt;
    
   public Manager(String nombre, int numeroEmpleado, double salary, String nameDpt) {
        super(nombre, numeroEmpleado, salary);
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
    
}
