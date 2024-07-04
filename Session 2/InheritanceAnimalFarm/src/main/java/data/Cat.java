package data;

public sealed class Cat extends Animal permits Housecat, Tiger {
    public Cat(int size, double weight, Color color) {
        super(size, weight, color);
    }

    @Override
    public String makeSound() {
        return "Meeeeeeeeeeeeeowwwww";
    }
}
