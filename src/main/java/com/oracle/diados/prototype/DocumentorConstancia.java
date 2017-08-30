package com.oracle.diados.prototype;

public class DocumentorConstancia extends Documento {

    @Override
    public void impirme() {
        System.out.println("imprime constancia: " + contenido);

    }

    @Override
    public void visualiza() {
        System.out.println("Mostrar constancia: " + contenido);
    }
    
    
    
}
