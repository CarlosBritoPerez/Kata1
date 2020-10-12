package kata1;

import java.time.LocalDate;
import java.time.Month;


public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person ("Carlos", LocalDate.of(1999, Month.APRIL, 20));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }

}