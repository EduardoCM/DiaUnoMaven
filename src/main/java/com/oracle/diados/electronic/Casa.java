package com.oracle.diados.electronic;

public class Casa {
    
    public static void main(String[] args) {
        
        ElectronicDevice tv = new Television("Panasonic");
        ElectronicDevice cel = new MobilePhone("Android");
        
        tv.turnOn();
        tv.turnOf();
        
        cel.turnOn();
        cel.turnOf();
        
    }
    
}
