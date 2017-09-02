package com.oracle.diacinco.hilos;

public class TestThreadDos extends Thread {
    
    public TestThreadDos(){
        super(" Hilo Numero Dos ");
    }

    @Override
    public void run() {
    
        for(int x = 0; x < 10000; x++){
            System.out.println("Valor 2: " + x + getName());
        }
    
    }
    
    
    
    
}
