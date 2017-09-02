package com.oracle.diacinco.productorConsumidor;

public class Fumador extends Thread {
    
    private Mesa mesa;
    
    public Fumador(Mesa mesa, String name){
        super(name);
        this.mesa = mesa;
    }
    
    
    @Override
    public void run() {
      while(true){
          Cigarro c;
                  
      }
    }
    
}
