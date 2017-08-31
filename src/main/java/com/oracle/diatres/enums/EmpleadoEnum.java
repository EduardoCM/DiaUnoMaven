package com.oracle.diatres.enums;

public enum EmpleadoEnum {
    
    ASALARIADO(10_000),
    HONORARIOS(5_000),
    FRELANCE(3_000);
    
    int sueldo;
    
    private EmpleadoEnum(int sueldo){
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
