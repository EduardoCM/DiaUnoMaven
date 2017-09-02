package com.oracle.diacuatro.funcionalInterface;

public class FuncInterfaceTest {
    
    public static void main(String[] args) {
        FuncInterfaceTest test = new FuncInterfaceTest();        
        double result = test.operar(12, 15);
        System.out.print(result);
    }
    
    public double operar(double x, double y){
        Operacion op = (double n1, double n2) -> n1 + n2;
        return op.calcular(x, y);
    }
}
