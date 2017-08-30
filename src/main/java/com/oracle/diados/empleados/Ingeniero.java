package com.oracle.diados.empleados;

public class Ingeniero extends Empleado {
    
    public Ingeniero(String nombre, int numeroEmpleado, double salary) {
        super(nombre, numeroEmpleado, salary);
    }

    @Override
    public double getBonusPercent(Empleado empleado) {
        return empleado.getSalary() * .20;
    }
    
    
}
