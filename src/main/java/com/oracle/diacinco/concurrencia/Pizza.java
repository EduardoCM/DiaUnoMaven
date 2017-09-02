package com.oracle.diacinco.concurrencia;

public class Pizza {
    private String especializad;
    private double precio;

    public Pizza() {
    }

    public Pizza(String especializad, double precio) {
        this.especializad = especializad;
        this.precio = precio;
    }

    public String getEspecializad() {
        return especializad;
    }

    public void setEspecializad(String especializad) {
        this.especializad = especializad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
