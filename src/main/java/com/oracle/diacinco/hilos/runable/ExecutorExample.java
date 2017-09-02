package com.oracle.diacinco.hilos.runable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorExample {
    
    public static void main(String args[]){       
        ExecutorService es = Executors.newCachedThreadPool();
        
        es.execute(new ExampleRunnable("ONE"));
        es.execute(new ExampleRunnable("TWO"));
        es.shutdown();
        
        
    }
}
