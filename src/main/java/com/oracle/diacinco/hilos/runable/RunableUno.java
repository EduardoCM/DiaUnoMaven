/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.diacinco.hilos.runable;

/**
 *
 * @author diCenter
 */
public class RunableUno implements Runnable{

    @Override
    public void run() {
       
         for(int x=0; x < 100000; x++){
            try {
                Thread.sleep(100);
                System.out.println("R_1: " + x);
            } catch (InterruptedException ex) {
         
            }
        }
    }
    
}
