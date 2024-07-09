import data.Animal;
import data.Cat;
import data.Dog;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Animal dog = new Dog(12, "");
        Animal cat = new Cat(12, "");
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        for (Animal animal : animals) {
            if(animal instanceof Dog d) { // Pattern matching
                d.bark();
            } else {

            }
        }

    }
}
