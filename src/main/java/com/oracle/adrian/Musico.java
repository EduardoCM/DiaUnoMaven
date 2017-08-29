package com.oracle.adrian;

public abstract class Musico {
        
    private String instrumento;
    
    public Musico(String instrumento){
        this.instrumento = instrumento;
    }
    
    // Métodos Abstractos
    public abstract void tocar();    
    public abstract void practicar();

    //Métodos concretos
    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }        
    
}
