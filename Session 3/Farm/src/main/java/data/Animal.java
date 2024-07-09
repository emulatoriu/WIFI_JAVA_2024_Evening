package data;

public abstract class Animal {
    private int age;
    private final String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
