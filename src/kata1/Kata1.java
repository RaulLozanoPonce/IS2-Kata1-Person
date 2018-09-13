package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1998, 8, 10);
        
        Person person = new Person("Raúl",date);
        System.out.println(person.getName() +
                " tiene " + person.getAge() + " años.");
    }
    
}