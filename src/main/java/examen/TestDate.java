package examen;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class TestDate {
    
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        
        date = date.plusDays(2);
        date = date.plusYears(3);
        
        System.out.println(date.getYear() + ":" + date.getMonth() + ":" + date.getDayOfMonth());
        
    }
    
}
