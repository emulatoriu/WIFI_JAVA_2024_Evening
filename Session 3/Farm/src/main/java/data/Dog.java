package data;

public class Dog extends Animal{
    public Dog(int age, String name) {
        super(age, name);
    }

    public void bark() {
        System.out.println("wuff");
    }
}
