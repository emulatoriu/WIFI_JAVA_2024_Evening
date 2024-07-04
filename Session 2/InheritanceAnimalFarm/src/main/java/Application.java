import data.Animal;
import data.Car;
import data.Cat;
import data.Color;

public class Application {
    public static void main(String[] args) {
        //Encapsulation example
        Car car = new Car();
        int distanceInKm = 100_000;
        car.setDistanceInKm(distanceInKm);
        System.out.println(car.getMiles());

        //Animal
        Cat cat = new Cat(55, 5, Color.GREY);
        cat.setWeight(4);
        System.out.println(cat.getSize());
    }
}

