package com.oracle.diados.empleados;

public abstract class Empleado {
    
    private String nombre;
    private int numeroEmpleado;
    private double salary;

    public Empleado(String nombre, int numeroEmpleado, double salary) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
   public String getDetails(){
       return "Nombre: " + nombre + " NoEmpleado: " + numeroEmpleado;
   }
   
   public abstract double getBonusPercent(Empleado empleado);   
}
