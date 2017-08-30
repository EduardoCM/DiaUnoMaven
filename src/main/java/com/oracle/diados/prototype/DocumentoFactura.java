package com.oracle.diados.prototype;

public class DocumentoFactura extends Documento {

    @Override
    public void impirme() {
        System.out.println("::: imprimiendo Factura " + contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("::: Imprimiendo Factura " + contenido);
    }
    
    
}
