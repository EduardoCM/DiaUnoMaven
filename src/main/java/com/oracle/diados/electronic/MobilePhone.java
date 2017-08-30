package com.oracle.diados.electronic;


public class MobilePhone extends ElectronicDevice {
    
    public MobilePhone(String name){
        super(name);
    }

    @Override
    public void turnOf() {
        System.out.println("apagar como telefono " + getName());
    }

    @Override
    public void turnOn() {
        System.out.println("Encender como telefono" + getName());
    }
    
    
    
    
}
