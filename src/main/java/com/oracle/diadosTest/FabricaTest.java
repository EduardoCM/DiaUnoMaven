package com.oracle.diadosTest;

import com.oracle.diados.acceso.Producto;

public class FabricaTest extends Producto{
    
    public static void main(String[] args) {
        
        FabricaTest fabrica = new FabricaTest();
        
        fabrica.name = "Drone";
        fabrica.precio = 1_000;
   
    }
    
}
