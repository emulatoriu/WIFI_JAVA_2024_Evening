package logic;

import data.Person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    public List<Person> getAdults(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.age() >= 18)
                .collect(Collectors.toList());
    }
}
