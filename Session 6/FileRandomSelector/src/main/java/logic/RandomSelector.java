package logic;

import java.util.List;
import java.util.Random;

public class RandomSelector {
    private final Random random;

    public RandomSelector(Random random) {
        this.random = random;
    }

    public String getRandomName(List<String> names) {
        int randomNumber = random.nextInt(0, names.size());
        return names.get(randomNumber);
    }
}
