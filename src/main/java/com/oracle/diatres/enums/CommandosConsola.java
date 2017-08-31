package com.oracle.diatres.enums;

public enum CommandosConsola {
    
    EXECUTE_JAR_ACTUALIZACION_BD("java -jar actializa.jar"),
    EXECUTE_UPDATE_SERVIDOR_LINUX("java - jar update_server.jar"),
    EXECUT_JAR_REFRESH("java -jar refresh.java");
    
    String commando;
    
    private CommandosConsola(String comando){
        this.commando = comando;
    }

    public String getCommando() {
        return commando;
    }

    public void setCommando(String commando) {
        this.commando = commando;
    }
    
    
    
}
