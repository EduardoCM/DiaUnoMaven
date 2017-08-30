package com.oracle.diados.empleados;

public class EqualsEjemplo {
    
    
    public static void main(String[] args) {
        
        Manager man1 = new Manager("ALBERTO",  20_000, "Arquitectura");
        Manager man2 = new Manager("Alberto", 20_000, "Arquitectura");
        
        Ingeniero ing = new Ingeniero("Alberto",  20_000);
        
        
        if(man1.equals(ing)){
            System.out.println("::: Son el mismo");
        }else{
            System.out.println("::: Son Diferentes");
        }
        
    }
    
}
