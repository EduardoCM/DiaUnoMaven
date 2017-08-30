package com.oracle.diados.prototype;

public class SolicitudMatriculacion extends Documento {

    @Override
    public void impirme() {
        System.out.println("Imprime la matriculacion: " + contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Muestra la solicitud de matriculacion " + contenido);  
    }
    
    
}
