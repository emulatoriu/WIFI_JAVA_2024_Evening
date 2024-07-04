package data;

public class Car {
    private double distanceInKm;
    private double miles;

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm = distanceInKm;
        this.miles = distanceInKm / 1.6;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
        this.distanceInKm = miles * 1.6;
    }
}
