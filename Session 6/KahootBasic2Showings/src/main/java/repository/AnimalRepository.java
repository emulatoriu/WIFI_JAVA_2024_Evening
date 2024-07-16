package repository;

import data.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    private final List<Animal> animals;

    //Singelton Pattern
    private static AnimalRepository animalRepository;


    public static AnimalRepository getAnimalRepository() {
        if(animalRepository == null) {
            animalRepository = new AnimalRepository(new ArrayList<>());
        }
        return animalRepository;
    }

    private AnimalRepository(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
