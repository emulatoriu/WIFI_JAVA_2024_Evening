import data.Person;

import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Person papaopa = new Person("papaopa", 60, Optional.empty(), Optional.empty());
        Person papaoma = new Person("papaoma", 60, Optional.empty(), Optional.empty());//die ist gesucht
        Person papa = new Person("papa", 30, Optional.of(papaopa), Optional.of(papaoma));
        Person mamaopa = new Person("mamaopa", 60, Optional.empty(), Optional.empty());
        Person mamaoma = new Person("mamaoma", 60, Optional.empty(), Optional.empty());
        Person mama = new Person("mama", 35, Optional.of(mamaopa), Optional.of(mamaoma));
        Person ich = new Person("ich", 5, Optional.of(papa), Optional.of(mama));

        PersonService personService = new PersonService();
        Optional<Person> found = personService.findPerson(ich, "papaoma");
        if(found.isPresent()) {
            System.out.println(found.get().name());
        } else {
            System.out.println("NOTFOUND");
        }

    }
}
