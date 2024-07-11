import data.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<Integer, Vehicle> parkingSlots = new HashMap<>();
        Vehicle v1 = new Vehicle("BMW", 4, 70_000);
        Vehicle v2 = new Vehicle("Suzuki", 4, 25_000);
        Vehicle v3 = new Vehicle("Volkswagen", 4, 45_000);

        parkingSlots.put(1, v1);
        parkingSlots.put(2, v2);
        parkingSlots.put(1, v3);

        System.out.println(parkingSlots.get(1));
        System.out.println(parkingSlots.get(2));
        System.out.println(parkingSlots.get(3));
    }
}
