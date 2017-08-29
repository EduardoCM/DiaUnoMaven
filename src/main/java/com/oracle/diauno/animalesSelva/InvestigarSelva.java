package com.oracle.diauno.animalesSelva;

public class InvestigarSelva {    
    public void checkSound(LiveInSelva selva){
        selva.makeSound();
    }
    
    public static void main(String[] args) {
        InvestigarSelva investigador = new InvestigarSelva();
        investigador.checkSound(new Leon());
        investigador.checkSound(new Bisonte());
    }
}
