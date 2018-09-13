package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1998, Month.AUGUST, 10);
        
        Person person = new Person("Raúl",date);
        System.out.println(person.getName() +
                " tiene " + person.getAge() + " años.");
    }
}