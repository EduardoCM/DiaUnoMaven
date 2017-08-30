package com.oracle.diados.pedido;

public class Usuario {
    
    public static void main(String[] args) {
        Cliente cliente;
        
        cliente = new ClienteContado();
        cliente.nuevoPedido(5_000);
        cliente.nuevoPedido(200_000);
        cliente.nuevoPedido(52_000);
        
        
        cliente = new ClienteCredito();
        cliente.nuevoPedido(1_500);
        cliente.nuevoPedido(2_000);
        cliente.nuevoPedido(15_000);
             
    }
}
