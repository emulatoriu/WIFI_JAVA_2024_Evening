package data;

import logic.BarkBehaviour;

public class Dog {
    private final String name;
    private final String race;
    private int age;

    private final BarkBehaviour barkBehaviour;

    public Dog(String name, String race, int age, BarkBehaviour barkBehaviour) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.barkBehaviour = barkBehaviour;
    }
    public void bark() {
        barkBehaviour.bark();
    }
}
