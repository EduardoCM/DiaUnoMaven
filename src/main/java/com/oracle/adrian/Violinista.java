package com.oracle.adrian;

public class Violinista extends Musico{
    
    public Violinista(String instrumento){
        super(instrumento);        
    }

    @Override
    public void tocar() {
        System.out.println("Afina " + this.getInstrumento());
        System.out.println("Toca " + this.getInstrumento());
    }

    @Override
    public void practicar() {
        System.out.println("Afina " + this.getInstrumento());
        System.out.println("Practica con " + this.getInstrumento());
    }
    
}
