package com.oracle.diacinco.hilos;

public class ThreadTest extends Thread{
    
    public ThreadTest(){
        super(" Hilo Numero 1 ");
    }

    @Override
    public void run() {
        for(int x=0; x<= 10000; x++){
            System.out.println("Valor: " + x + getName());            
        }
    }
    
    
    
    
    
    
    
}
