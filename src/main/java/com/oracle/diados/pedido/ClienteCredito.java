package com.oracle.diados.pedido;

public class ClienteCredito extends Cliente {

    @Override
    protected Pedido creaPedido(double importe) {
       return new PedidoCredito(importe);
    }
    
    
    
}
