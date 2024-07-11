import data.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        Greets bugsBunny = (name) -> System.out.println("Whats " + name + " up doc?");
        Greets bugsBunnyClass = new BugsBunnyGreeter();
        bugsBunnyClass.greet("Milos");

        Greets masterYoda = (name) -> System.out.println(name + ", welcome you are!");
        Greets terminator = (name) -> System.out.println("Servus, " + name + " I´ll be back.");
        execute(bugsBunny, "Milos");
        execute(masterYoda, "Brigitta");
        execute(terminator, "Lukas");

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        Consumer<Integer> myFunction = number -> System.out.println(++number);
        numbers.forEach(myFunction);

        Incrementer incrementer = (number -> ++number);
        System.out.println(incrementer.increment(4));
        Predicate<String> checkName = (name) -> name.length() > 5;

        Person p1 = new Person("aaa", 20);
        Person p2 = new Person("ccc", 40);
        Person p3 = new Person("bbb", 60);

        List<Person> persons = new ArrayList<>(List.of(p1, p2, p3));
        persons.sort((person1, person2) -> (person2.age() - person1.age()));
        System.out.println(persons);
    }

    public static void execute(Greets function, String name) {
        function.greet(name);
    }
}
