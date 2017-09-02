package com.oracle.diacinco.hilos.runable;

public class ExampleRunnable implements Runnable{
    
    private final String name;
    
    public ExampleRunnable(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized(this){
                 System.out.println(name +  " : " + i);    
            }
        }
    }   
}