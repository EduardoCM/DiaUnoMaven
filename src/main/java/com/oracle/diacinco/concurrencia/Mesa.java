package com.oracle.diacinco.concurrencia;

public class Mesa {

    private Pizza pizza;

    public synchronized void colocarPizza(Pizza p) {
        while (pizza != null) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.pizza=p;
        System.out.println("Pizza creada de : "+p.getEspecializad());
        notifyAll();
    }

    public synchronized Pizza obtenerPizza() {
        while (pizza == null) {
            try {
                wait();
            } catch (Exception e) {
            }
       
        }
        Pizza p=pizza;
        pizza=null;
        System.out.println("Pizza de "+p.getEspecializad()+" enviada");
        notifyAll();
        return p;

    }
}