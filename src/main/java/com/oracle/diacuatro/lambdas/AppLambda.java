package com.oracle.diacuatro.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppLambda {
    
    public static void main(String[] args) {
        AppLambda.ordenarLista();
    }
    
    
    public static void ordenarLista(){
        List<String> lista = new ArrayList<>();
        lista.add("Erika");
        lista.add("Israel");
        lista.add("Alfredo");
        lista.add("Adrian");
        lista.add("Berenice");
        
        /*
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return o1.compareTo(o2);
            }
        });  
            (Parametros) -> (operacion)
        */
        
        Collections.sort(lista, (String p1, String  p2) -> p1.compareTo(p2));
        
        for(String nombre: lista){
            System.out.println(":: " + nombre);
        }
        
    }
    
}
