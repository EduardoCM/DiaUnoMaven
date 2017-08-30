package com.oracle.diados.empleados;

public abstract class Empleado {
    
    private static int numeroEmpleado=1;
    private String nombre;
    private double salary;
    
    {
       numeroEmpleado ++; 
    }
    
    public static void resetearNumeroEmpleado(){
        numeroEmpleado = 0;
    }

    public Empleado(String nombre, double salary) {
        this.nombre = nombre;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
    
    
    
    
   public String getDetails(){
       return "Nombre: " + nombre + " NoEmpleado: " + numeroEmpleado;
   }
   
   public abstract double getBonusPercent(Empleado empleado);   
}
