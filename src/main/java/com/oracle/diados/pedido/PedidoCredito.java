package com.oracle.diados.pedido;

public class PedidoCredito extends Pedido {
    
    public PedidoCredito(double importe){
        super(importe);
    }

    @Override
    public boolean valida() {
        return (importe >= 1_000.0) && (importe <= 5_000.0);
    }

    @Override
    public void paga() {
       System.out.println("El pago del pedido a credito de: " + importe + " se ha realizado");
    }
    
    
    
}
