package com.oracle.diados.singleton;

import java.util.Map;

public class Documento {
    
    private String name;
    private String extencion;
    private Map<String, Object> parametros;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    public Map<String, Object> getParametros() {
        return parametros;
    }

    public void setParametros(Map<String, Object> parametros) {
        this.parametros = parametros;
    }
    
    
    
    
    
}
