package data;

import java.util.Objects;

public final class Car {
    private final String brand;
    private final double price;
    private final String color;

    public Car(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String brand() {
        return brand;
    }

    public double price() {
        return price;
    }

    public String color() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Car) obj;
        return Objects.equals(this.brand, that.brand) &&
                Double.doubleToLongBits(this.price) == Double.doubleToLongBits(that.price) &&
                Objects.equals(this.color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, color);
    }

    @Override
    public String toString() {
        return "Car[" +
                "brand=" + brand + ", " +
                "price=" + price + ", " +
                "color=" + color + ']';
    }

}
