package com.oracle.diauno.empleados;

public class EmpleadoHonorarios extends Empleado {
    
    public static final double IVA=.16;
    public static final double ISR = .10;
    
    public EmpleadoHonorarios(String nombre, double salario, int edad){
        super(nombre, salario, edad);
    }
    

    @Override
    public double generarIngresos() {
       double descuentoIva = getSueldo() * IVA;
       double descuentoIsr = getSueldo() * ISR;
       return getSueldo() - descuentoIva - descuentoIsr;
    }
    
}
