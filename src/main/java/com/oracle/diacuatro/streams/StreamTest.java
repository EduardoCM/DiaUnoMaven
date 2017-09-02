package com.oracle.diacuatro.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

    private  List<String> lista;
    private  List<String> numeros;
    
    public StreamTest(){ 
        lista = new ArrayList<>();
        lista.add("Erika");
        lista.add("Bere");
        lista.add("Israel");
        lista.add("Adrian");
        lista.add("Alfredo");
        
        numeros = new ArrayList<>();
        numeros.add("5");
        numeros.add("6");
        numeros.add("7");
        
    }
    
    public  void filtrar(){
        lista.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
    }
    
    public void ordenar(){
        lista.stream().sorted((x, y) -> x.compareTo(y)).forEach(System.out::println);
    }
    
    public void transformar(){
        numeros.stream().map(x -> Integer.parseInt(x) * 5).forEach(System.out::println);
    }
    
    public void limitar(){
        lista.stream().limit(2).forEach(System.out::println);
    }
    
    
    public static void main(String[] args) {
        StreamTest test = new StreamTest();
        test.limitar();
    }
}
