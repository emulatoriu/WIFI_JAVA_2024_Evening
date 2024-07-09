import data.Car;

public class Application {
    public static void main(String[] args) {
        Car fiat = new Car("Fiat", 20_000, "blue");
        Car porsche = new Car("Fiat", 20_000, "blue");
        Car ferrari = fiat;
        System.out.println(fiat == porsche);
        System.out.println(fiat.equals(porsche));
        System.out.println(porsche);
    }
}
