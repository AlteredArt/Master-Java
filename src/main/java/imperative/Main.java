package imperative;
import java.util.ArrayList;
import java.util.List;
import static imperative.Main.Gender.*;


public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person(name: "Jared", MALE),
                new Person(name: "Waffles", MALE),
                new Person(name: "Chloe", FEMALE)
        );

        //IMPERATIVE
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if(FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person person : females) {
            System.out.println(female);
        }
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {MALE, FEMALE}
}
