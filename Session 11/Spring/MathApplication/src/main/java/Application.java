import logic.Addition;
import logic.Calculate;

public class Application {
    public static void main(String[] args) {
        Calculate adder = new Addition();
        System.out.println(adder.calculate(5,7));
    }
}
