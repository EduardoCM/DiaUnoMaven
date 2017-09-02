package com.oracle.diacinco.hilos.runable;

public class RunableTest {
    
    
    public static void main(String args[]){
    
        RunableUno r1 = new RunableUno();
        RunableDos r2 = new RunableDos();
        
        
        r1.run();
        r2.run();
    
        
    }
    
    
    
}
