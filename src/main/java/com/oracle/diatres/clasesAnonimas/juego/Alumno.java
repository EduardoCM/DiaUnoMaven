package com.oracle.diatres.clasesAnonimas.juego;

public class Alumno {
    
    String nombre;
    Horario horario;
    String numeroControl;
    
    
    public void main(){
    
        Consultas consulta = new Consultas() {
            @Override
            public void consultarCalificacionesFinales(String numeroControl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        consulta.consultarCalificacionesFinales("10281372");
     
    }
    
   public abstract class Consultas{
        
        public  abstract  void  consultarCalificacionesFinales(String numeroControl);
    
    }
    
    private class Horario {
        private String materia;
        private int dia;
        private int semana;
        private int mes;
        private int semestre;
        private int anio;
        
        
        public Horario(Alumno alumno, Horario horario){
            
        }
       

        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public int getSemana() {
            return semana;
        }

        public void setSemana(int semana) {
            this.semana = semana;
        }

        public int getMes() {
            return mes;
        }

        public void setMes(int mes) {
            this.mes = mes;
        }

        public int getSemestre() {
            return semestre;
        }

        public void setSemestre(int semestre) {
            this.semestre = semestre;
        }

        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }
        
        
    }
    
    
    
}
