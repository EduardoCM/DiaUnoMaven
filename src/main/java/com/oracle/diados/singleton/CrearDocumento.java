package com.oracle.diados.singleton;

public class CrearDocumento {
    
    public static void main(String[] args) {
        
        
        DocumentoBlanco doc = DocumentoBlanco.getInstance();
        
        if(doc instanceof Documento){
            System.out.println("Es una instancia de Documento en Blanco");
        }
        
    }
    
}
