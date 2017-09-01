package com.oracle.diatres.exceptions;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestException {
    
    public static void main(String[] args) {
        
        System.out.println("::::: Programa inicia ::::");
        
        try{
            int[] arreglo = new int[5];            
            arreglo[2] = 2;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(":::: Falla de arreglo :::::");
            e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println(":::: fallo al realizar la operacion ::::");
            e.printStackTrace();
        }catch(Exception e){
            System.out.println(":::: Fallo por una razond esocnocida :::::");
            e.printStackTrace();
        }finally{
            System.out.println("::::: Finally ::::::");
            System.out.println("::::: Cerrar conexiones");
        }
        
        System.out.println("::::: Programa termina ::::");
    }
    
}
