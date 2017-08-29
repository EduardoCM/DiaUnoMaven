package com.oracle.diauno.empleados;

public class TestEmpleado {
    
    public static void main(String[] args) {       
        Empleado[] empleado = new Empleado[3]; 
        empleado[0] = new EmpleadoAsalariado("Pedro", 10_000, 28);
        empleado[1] = new EmpleadoAsalariado("Alberto", 15_000, 25);
        empleado[2] = new EmpleadoHonorarios("Yasmin", 20_000, 30);    
        System.out.println(TestEmpleado.calcularIngresosTotales(empleado));
    }
    public static double calcularIngresosTotales(Empleado arr[]){
       double ingresosTotales = 0;
        for (Empleado empleado : arr) {
            ingresosTotales = ingresosTotales + empleado.getSueldo();
        }
        
        return ingresosTotales;
    }
}
