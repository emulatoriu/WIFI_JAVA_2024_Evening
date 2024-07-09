import data.Dog;
import logic.BigDogBark;
import logic.SmallDogBark;

public class Application {
    public static void main(String[] args) {
        Dog berhardiner = new Dog("Beethoven", "Berhardiner", 200, new BigDogBark());
        berhardiner.bark();
        Dog chihuahua = new Dog("Dj BOBO", "Chihuahua", 1, new SmallDogBark());
        chihuahua.bark();

    }
}
