package com.oracle.diados.prototype;

public class Usuario {
 
    

    public static void main(String[] args) {
        
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
        
        documentacionEnBlanco.incluye(new OrdenarPedido());
        documentacionEnBlanco.incluye(new DocumentorConstancia());
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());
        documentacionEnBlanco.incluye(new DocumentoFactura());
        
        
        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Raul");
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Erika");
        
        
        documentacionCliente1.imprime();
        documentacionCliente2.imprime();
        
        
        
        
    }


}
