package com.oracle.diacinco.hilos;

public class TestThread {
    
    public static void main(String args[]){
        
      ThreadTest thread = new ThreadTest();
      TestThreadDos threadDos = new TestThreadDos();
    
          thread.start();
          threadDos.start();
    }    
}
