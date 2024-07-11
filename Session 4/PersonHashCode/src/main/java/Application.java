import data.Person;

import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Person p1 = new Person("Andrea", "Unger", 20, "blue");
        Person p2 = new Person("Andrea", "Unger", 20, "blue");

        System.out.println(p1.equals(p2));
        Set<Person> persons = new HashSet<>();
        persons.add(p1);
        persons.add(p2);
        System.out.println(persons.size());
    }
}
