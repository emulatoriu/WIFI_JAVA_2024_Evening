import logic.Runner;
import logic.fizzbuzz.*;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<FizzBuzzCheck> checker =
                List.of(new ModuloThreeAndFiveChecker(),
                        new ModuloFiveChecker(),
                        new ModuloThreeChecker(),
                        new ModuloSevenChecker());
        Runner runner = new Runner(checker);
        runner.run();
    }
}
