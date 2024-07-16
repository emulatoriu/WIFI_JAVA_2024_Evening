import data.Person;

import javax.swing.text.html.Option;
import java.util.Optional;

public class PersonService {
    public Optional<Person> findPerson(Person start, String name) {
        if(start.name().equals(name)) return Optional.of(start);
        Optional<Person> papa = start.papa();
        Optional<Person> mama = start.mama();
        if (papa.isEmpty() && mama.isEmpty()) return Optional.empty();
        Optional<Person> found;
        found = findPerson(papa.get(), name);
        if (found.isPresent()) return found;
        found = findPerson(mama.get(), name);
        return found;
    }
}
