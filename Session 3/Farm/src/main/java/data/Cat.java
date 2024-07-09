package data;

public class Cat extends Animal{
    public Cat(int age, String name) {
        super(age, name);
    }

    public void makeMeow() {
        System.out.println("Meow");
    }
}
