package com.oracle.diacuatro.lambdas;

public class LambdaTest {
    
    public static void main(String[] args) {
         Operacion operacion = (double num1, double num2) -> { 
         
             double valor3 = 2;
             System.out.println("Num1: " + num1);
             System.out.println("Num2: " + num2);
             
             return (num1 + num2) / 2; 
         
         };
       
         System.out.println(operacion.calcularPromedio(10, 9));
         
    }
    
    public static void calcular(){
        /*
        Operacion operacion = new Operacion() {
            @Override
            public double calcularPromedio(double num1, double num2) {
                     return (num1 + num2)/2;
            }
        };
      double promedio = operacion.calcularPromedio(10, 8);
      System.out.println("Resultado: " + promedio);
       */
        
        
        
    }
    
}
