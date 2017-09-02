package com.oracle.diacuatro.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsApp {
    
    private List<String> lista;
    
    public CollectionsApp(){
        lista = new ArrayList<>();
        
        lista.add("Adrian");
        lista.add("Alfredo");
        lista.add("Erika");
    }
    
    public void usarForEach(){
        lista.forEach(System.out::println);
    }
    
    public void remove(){
        lista.removeIf(x -> x.startsWith("A"));
    }
    
    public void sort(){
        lista.sort((x, y) -> x.compareTo(y));
    }
    
    
    public static void main(String[] args) {
        
        CollectionsApp coll = new CollectionsApp();
        coll.sort();
        coll.usarForEach();
    }
    
}
