package com.oracle.diacinco.rxJava;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.functions.Action1;


public class RxApp {
    
    private List<Integer> lista1;
    private List<Integer> lista2;
    
    
    public RxApp(){
        lista1 = new ArrayList<>();
        lista2 = new ArrayList<>();
        this.llenarListas();
    }
    
    public void llenarListas(){
        for(int i=0; i < 1_000_000; i++){
            lista1.add(i);
            lista2.add(i);
        }
    }
    
    public void buscar(){
        
        Observable<Integer> obs1 = Observable.from(lista1);
        Observable<Integer> obs2 = Observable.from(lista2);
        
        
        /*
        Observable.merge(obs1, obs2).subscribe(new Action1<Integer>() {          
            @Override
            public void call(Integer t) {
                if(t == 1){
                    System.out.println("::::: " + 1);
                } else if(t == 5 || t == 10 || t == 20){
                    System.out.println("::::: " + t);
                }
            }
        });
        */
        
       // Observable.merge(obs1, obs2).filter(x -> x == 1 || x == 10 || x == 50).subscribe(System.out::println);
        
        Observable.merge(obs1, obs2).filter(x -> x  < 1000).subscribe(x -> {        
            if(x == 1 || x == 5 || x == 10){
                System.out.println(x);
            }
        });
        
    }
    public static void main(String args[]){
        RxApp app = new RxApp();
        app.buscar();
    }
    
}
