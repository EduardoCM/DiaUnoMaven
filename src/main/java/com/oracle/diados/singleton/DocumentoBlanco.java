package com.oracle.diados.singleton;

public class DocumentoBlanco extends Documento {
    
    private static DocumentoBlanco _instance = null;
    
    private DocumentoBlanco(){     
    }
    
    public static DocumentoBlanco getInstance(){
        if(_instance == null){
            _instance = new DocumentoBlanco();
        }
        return _instance;
    }
}
