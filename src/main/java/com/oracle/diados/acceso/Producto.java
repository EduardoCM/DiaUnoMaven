package com.oracle.diados.acceso;

public class Producto  {
    
    public String name;
    
    protected double precio;
    
    private double iva;
    
    String tamaño;

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
    
    
}
