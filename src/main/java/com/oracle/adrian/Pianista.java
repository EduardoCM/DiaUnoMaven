package com.oracle.adrian;

public class Pianista extends Musico{
    
    public Pianista(String instrumento){
        super(instrumento);
    }

    @Override
    public void tocar() {        
        System.out.println("Toca " + this.getInstrumento());
    }

    @Override
    public void practicar() {
        System.out.println("Practica con " + this.getInstrumento());
    }
}
