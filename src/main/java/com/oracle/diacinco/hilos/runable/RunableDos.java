/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.diacinco.hilos.runable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diCenter
 */
public class RunableDos implements Runnable{

    @Override
    public void run() {
    
        for(int x=0; x < 100000; x++){
            try {
                Thread.sleep(100);
                System.out.println("R_2: " + x);
            } catch (InterruptedException ex) {
                Logger.getLogger(RunableDos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
}
