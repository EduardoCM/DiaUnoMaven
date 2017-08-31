package com.oracle.diatres.clasesAnonimas.juego;

public class Juego {
    
    
    public static void main(String[] args) {
        
        Enemigo rugal = new Enemigo()
        {
            @Override
            public void ataque() {
                System.out.println("atacar");
            }

            @Override
            public void generarPoder(String combinacion) {
                if(combinacion.equalsIgnoreCase("A + B + fechaAbajo")){
                    System.out.println("Enviar Poder");
                }
           
            }
        };
    }
    
    
    public interface Enemigo{
        
        public void ataque();
        public void generarPoder(String combinacion);
        
    }
    
    public interface Asistente{
        
    }
    
    class Jugador {
        
        private String nombreJugador;
        private int puntajeJugador = 100;
        
    }
    
}
