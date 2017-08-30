package com.oracle.diados.prototype;

public class OrdenarPedido extends Documento {

    @Override
    public void impirme() {
        System.out.println("Imprime la orden de pedido: " + contenido);
    }

    @Override
    public void visualiza() {
           System.out.println("Muestra la orden de pedido: " + contenido);   
    }
}
