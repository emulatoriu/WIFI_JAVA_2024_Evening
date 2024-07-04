package data;

public final class Dog extends Animal{
    public Dog(int size, double weight, Color color) {
        super(size, weight, color);
    }

    @Override
    public String makeSound() {
        return "Wuuuuuuuuuuuuuuuuuuffffffffff";
    }
}
