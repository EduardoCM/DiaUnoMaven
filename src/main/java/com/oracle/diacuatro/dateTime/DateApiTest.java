package com.oracle.diacuatro.dateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateApiTest {
    
    public static void main(String[] args) {
        DateApiTest.getTiempoNacimiento();
    }
    
    
    public static void formaterarFecha(String fecha){
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaLocal = LocalDate.parse(fecha, formateador);
    
        System.out.println("Fecha Local: " + fechaLocal);
        formateador = DateTimeFormatter.ofPattern("ddMMyyyyy");
        System.out.println(formateador.format(fechaLocal));
    }
    
    public static void getTiempoNacimiento(){
        LocalDate nacimiento = LocalDate.of(1990, Month.SEPTEMBER, 10);
        LocalDate actual = LocalDate.now();
        
        Period period = Period.between(nacimiento, actual);
        
        System.out.println("Han transcurrido: " + period.getYears() + " años " + period.getMonths() + " meses " + period.getDays()+ " dias desde que naciste");
    }
    
}
