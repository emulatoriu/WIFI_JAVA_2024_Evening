package data;

public abstract class Animal {
    private int size;
    private double weight;
    private final Color color;

    public Animal(int size, double weight, Color color) {
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public abstract String makeSound();
}
