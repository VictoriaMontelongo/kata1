
package kata1;

import java.time.LocalDate;
import java.time.Month;
public class Kata1 {

     
    public static void main(String[] args) {
       Person persona = new Person("Victoria Montelongo", LocalDate.of(1997, Month.JULY, 10));
        System.out.println(persona.getName()+" "+ persona.getAge());
    }
    
}
