/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate bday;
    
    
    public Person(String name, LocalDate bday){
        this.name = name;
        this.bday = bday;
    }
    public String getName(){
        return name;
    }
    
    public LocalDate getBday(){
        return bday;
    }
    
    public int getAge(){
        return toYears(LocalDate.now().toEpochDay() - bday.toEpochDay());
    }
    
    public int toYears(long days){
        return (int) days/365;
                
    }
}
