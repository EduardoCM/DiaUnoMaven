package com.oracle.diacinco.concurrencia;

public class PruebaPizzas {
    public static void main(String[] args) {
        Mesa m=new Mesa();
        Pizzero p=new Pizzero(m, "charly");
        Comelon f=new Comelon(m, "juan");
        Comelon g=new Comelon(m, "pepe");
        Comelon h=new Comelon(m, "pepe");
        p.start();
        f.start();
        g.start();
        h.start();
    }
}