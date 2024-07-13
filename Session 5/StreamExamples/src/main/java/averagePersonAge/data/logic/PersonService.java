package averagePersonAge.data.logic;

import averagePersonAge.data.Person;

import java.util.List;
import java.util.OptionalDouble;

public class PersonService {
    public Double getAverageAge (List<Person> persons) {
        return persons.stream()
                .mapToDouble(person -> person.age()) // DoubleStream
                .average()
                .getAsDouble();
    }
}
