package com.oracle.diados.electronic;

public abstract class ElectronicDevice {
    
    private String name;

    public ElectronicDevice(String name) {
        this.name = name;
    }
    
    public abstract void turnOf();
    
    public abstract void turnOn();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
