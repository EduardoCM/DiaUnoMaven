package com.oracle.diauno.empleados;

public abstract class Empleado {
    
    private String nombre;
    private double sueldo;
    private String numeroEmp;   
    private int edad;
    private char sexo;
    
    private Horario horario;
    
    
    public Empleado(){
        
    }

    public Empleado(String nombre, double sueldo, String numeroEmp, int edad, char sexo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.numeroEmp = numeroEmp;
        this.edad = edad;
        this.sexo = sexo;
    }
    
     public Empleado(String nombre, double sueldo, int edad) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.edad = edad;
    }
    
    public abstract double generarIngresos();

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNumeroEmp() {
        return numeroEmp;
    }

    public void setNumeroEmp(String numeroEmp) {
        this.numeroEmp = numeroEmp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Sueldo" + sueldo);
    }
    
    
    
    
}
