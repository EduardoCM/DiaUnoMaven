package com.oracle.diados.electronic;

public abstract class ElectronicDevice {
    
    private String name;
    private int voltaje;
    
    public ElectronicDevice(){
        
    }

    public ElectronicDevice(String name) {
        this.name = name;
    }
    
      public ElectronicDevice(String name, int voltaje) {
        this.name = name;
        this.voltaje = voltaje;
    }
    
    public abstract void turnOf();
    
    public abstract void turnOn();

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
