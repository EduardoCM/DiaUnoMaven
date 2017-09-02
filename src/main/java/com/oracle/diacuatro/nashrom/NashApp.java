package com.oracle.diacuatro.nashrom;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashApp {
    
    private ScriptEngineManager m;
    private ScriptEngine e;
    private Invocable invocator;
    
    public NashApp(){
        m = new ScriptEngineManager();
        e = m.getEngineByName("nashorn");
        invocator = (Invocable) e;
    }
    
    
    public void llamarFunciones() throws Exception{
        e.eval("C:\\Users\\diCenter\\Documents\\ProyectoCurso\\dia2\\DiaUnoMaven\\src\\main\\java\\com\\oracle\\diacuatro\\nashrom\\archivo.js");
        
         String resultado = (String) invocator.invokeFunction("calcular", "5", "6");
         System.out.println("Resultado: " + resultado);
    }
    
    public static void main(String[] args) throws Exception {
       
        NashApp nash = new NashApp();
        nash.llamarFunciones();
        
    }
    
}
