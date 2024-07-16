package data;

import java.util.Optional;

public record Person(String name, int age, Optional<Person> papa, Optional<Person> mama) {
}
