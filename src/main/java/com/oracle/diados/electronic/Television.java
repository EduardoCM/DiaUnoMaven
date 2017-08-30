package com.oracle.diados.electronic;

public class Television extends ElectronicDevice {

    public Television(String name){
        super(name);
    }
    
    @Override
    public void turnOf() {
        System.out.println("Apagar como television " + getName());
    }

    @Override
    public void turnOn() {
        System.out.println("Prender como television " + getName());
    }
}
