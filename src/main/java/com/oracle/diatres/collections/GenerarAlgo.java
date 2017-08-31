package com.oracle.diatres.collections;





public class GenerarAlgo<N,A,D,T,Y,H,B,F extends Number> {
    
    N t;
    
    public GenerarAlgo(){
        
    }
    public GenerarAlgo(N t){
        this.t = t;
    }
    
    public void operar(N t){
        System.out.println(t.getClass().getName());
    }
}
