package com.oracle.diados.empleados;

public class Ingeniero extends Empleado {
    
    public Ingeniero(String nombre, double salary) {
        super(nombre,  salary);
    }

    @Override
    public double getBonusPercent(Empleado empleado) {
        return empleado.getSalary() * .20;
    }
    
    
}
