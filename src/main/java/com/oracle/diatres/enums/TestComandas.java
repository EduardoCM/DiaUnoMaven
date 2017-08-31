package com.oracle.diatres.enums;

public class TestComandas {
    
    
    public void test(CommandosConsola cmd){
        
        switch(cmd){
            case EXECUTE_JAR_ACTUALIZACION_BD:
            
                System.out.println(CommandosConsola.EXECUT_JAR_REFRESH.getCommando());
                
                break;
            
        }
    }
    
}
