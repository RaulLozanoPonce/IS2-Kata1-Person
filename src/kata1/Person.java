package kata1;

import java.time.Duration;
import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final long DAYS_PER_YEAR = (long) (365.25);

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public int getAge(){
        LocalDate today = LocalDate.now();
        Duration daysBetween = Duration.between(birthdate.atStartOfDay(), LocalDate.now().atStartOfDay());
        return (int) daysToYear(daysBetween.toDays());
    }
    
    private long daysToYear(long days){
        return days/DAYS_PER_YEAR;
    }
}