package logic;

import data.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PersonServiceTest {
    static Person papaopa;
    static Person papaoma;
    static Person papa;
    static Person mamaopa;
    static Person mamaoma;
    static Person mama;
    static Person ich;

    @BeforeAll
    void initalize() {
        papaopa = new Person("papaopa", 60, Optional.empty(), Optional.empty());
        papaoma = new Person("papaoma", 60, Optional.empty(), Optional.empty());//die ist gesucht
        papa = new Person("papa", 30, Optional.of(papaopa), Optional.of(papaoma));
        mamaopa = new Person("mamaopa", 60, Optional.empty(), Optional.empty());
        mamaoma = new Person("mamaoma", 60, Optional.empty(), Optional.empty());
        mama = new Person("mama", 35, Optional.of(mamaopa), Optional.of(mamaoma));
        ich = new Person("ich", 5, Optional.of(papa), Optional.of(mama));
    }

    @ParameterizedTest
    @MethodSource
    void findPerson(Person person, String name, Optional<Person> expected) {
        PersonService personService = new PersonService();
        Optional<Person> result = personService.findPerson(person, name);

        assertEquals(expected, result);
    }

    static Stream<Arguments> findPerson() {
        return Stream.of(
          Arguments.of(
                ich, "mamaoma", Optional.of(mamaoma)
          )
        );
    }
}