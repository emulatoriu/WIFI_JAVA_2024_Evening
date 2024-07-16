package data;

public class Animal {
    private String color;
    private double weight;
    private String race;
    public static int id;

    public Animal(String color, double weight, String race) {
        this.color = color;
        this.weight = weight;
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    //access modifier package private
    void makeSound() {
        System.out.println("Auuuuuuuuuuu");
    }

}
