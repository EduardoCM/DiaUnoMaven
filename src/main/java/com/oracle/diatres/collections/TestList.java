package com.oracle.diatres.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestList {
    
    public static void main(String[] args){
        List<Integer> lst = new ArrayList();
        
        int valor=10;
       
        lst.add(valor);
        lst.add(5);
        lst.add(new Integer(52));
        
        for (Integer integer : lst) {
            System.out.println(":: " + integer);
        }
        
    }
    
}
