package com.oracle.diacinco.concurrencia;


public class Pizzero extends Thread {

    private Mesa mesa;
    Pizza p[]={new Pizza("Peperoni", 200),new Pizza("Hawaiana",500),new Pizza("Mexicana", 900)};
    
    public Pizzero(Mesa mesa, String name) {
        super(name);
        this.mesa = mesa;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
            Pizza piz=p[((int)(Math.random()*p.length))];
            mesa.colocarPizza(piz);
        }
        
    
    }
}
