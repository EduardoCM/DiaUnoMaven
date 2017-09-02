package com.oracle.diacinco.productorConsumidor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Mesa {
    
    private Papel papel;
    private Tabaco tabaco;
    private Cerillo cerillo;
    
    public synchronized Cigarro obtenerCigarro() {
        while(papel == null || tabaco == null || cerillo == null){
            try {
                wait();
            } catch (InterruptedException ex) {            
            }
        }
         Cigarro c = new Cigarro(papel, tabaco, cerillo);
         papel = null;
         tabaco = null;
         cerillo = null;
         System.out.println("Me voy a fumar un cigarro: " + c);
         notifyAll();   
         return c;
    }
    
    public void colocarProducto(Producto p){
     if(p instanceof Papel){
         setPapel((Papel)p);
     }else if(p instanceof Tabaco){
         setTabaco((Tabaco)p);
     }else if(p instanceof Cerillo){
         setCerillo((Cerillo) p);
     }
    }

    public Papel getPapel() {
        return papel;
    }

    public synchronized void setPapel(Papel papel) {
        while(this.papel != null){
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        this.papel = papel;
        System.out.println("Se creo papel");
        notifyAll();
    }

    public Tabaco getTabaco() {
        return tabaco;
    }

    public synchronized void setTabaco(Tabaco tabaco) {
        while(this.tabaco != null){
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        this.tabaco = tabaco;
        System.out.println("Se creo tabaco");
        notifyAll();
    }

    public Cerillo getCerillo() {
        return cerillo;
    }

    public synchronized void setCerillo(Cerillo cerillo) {
        while(this.cerillo != null){
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        this.cerillo = cerillo;
        System.out.println("Se creo cerillo");
    }
}
