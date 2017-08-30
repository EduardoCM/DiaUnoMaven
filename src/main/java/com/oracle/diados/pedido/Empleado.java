package com.oracle.diados.pedido;


public class Empleado {
    
    private String nombre;
    private int numeroEmpleado;

    public Empleado(String nombre, int numeroEmpleado) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
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

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numeroEmpleado=" + numeroEmpleado + '}';
    }

  
    
    
    
    
    
}
