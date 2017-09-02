package com.oracle.diacinco.concurrencia;

public class Comelon extends Thread{
    private Mesa mesa;

    public Comelon(Mesa mesa, String name) {
        super(name);
        this.mesa = mesa;
    }
      
    @Override
    public void run() {
        while(true){
            Pizza p=mesa.obtenerPizza();
            System.out.println("\t--->"+getName()+"   Me voy a comer una pizza de : "+p.getEspecializad());
        }
    }
    
}