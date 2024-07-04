import logic.InputService;
import logic.Runner;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputService inputService = new InputService(scanner);
        Runner runner = new Runner(inputService);
        runner.run();
    }
}
