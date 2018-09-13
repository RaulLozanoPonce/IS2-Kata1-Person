package kata1;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(1998, Month.AUGUST, 10, 0, 0);
        DayOfWeek day = date.getDayOfWeek(); 
        
        Person person = new Person("Raúl",date);
        System.out.println(person.getName() +
                " tiene " + person.getAge() + " años, y nació un " + day + ".");
    }
}