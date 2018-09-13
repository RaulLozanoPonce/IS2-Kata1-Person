package kata1;

import java.time.Duration;
import java.time.LocalDateTime;

public class Person {
    private final String name;
    private final LocalDateTime birthdate;
    private final long DAYS_PER_YEAR = (long) (365.25);

    public String getName() {
        return name;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public Person(String name, LocalDateTime birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public int getAge(){
        LocalDateTime today = LocalDateTime.now();
        Duration daysBetween = Duration.between(birthdate, LocalDateTime.now());
        return (int) daysToYear(daysBetween.toDays());
    }
    
    private long daysToYear(long days){
        return days/DAYS_PER_YEAR;
    }
}