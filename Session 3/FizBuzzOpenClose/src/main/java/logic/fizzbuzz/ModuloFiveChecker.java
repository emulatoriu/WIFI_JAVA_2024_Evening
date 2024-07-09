package logic.fizzbuzz;

public class ModuloFiveChecker implements FizzBuzzCheck{
    @Override
    public boolean check(int number) {
        return number % 5 == 0;
    }

    @Override
    public void print() {
        System.out.println("Buzz");
    }
}
