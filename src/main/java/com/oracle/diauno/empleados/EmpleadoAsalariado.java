package com.oracle.diauno.empleados;

public final class EmpleadoAsalariado extends Empleado implements SeguroVida{
    
    
    //SeguroVida seguroVida;
    
    
    public static final double DESCUENTO_INFONAVIT=.15;
    public static final double DESCUENTO_IMSS=.10;
    
    public EmpleadoAsalariado(String nombre, double sueldo, int edad){
        super(nombre, sueldo, edad);
    }
    
    @Override
    public double generarIngresos() {
        double descuentoInf = getSueldo() * DESCUENTO_INFONAVIT;
        double descuentoImss = getSueldo() * DESCUENTO_IMSS;
      return getSueldo() - descuentoImss - descuentoInf;
    }

    @Override
    public void activarSeguro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void usarSeguro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
