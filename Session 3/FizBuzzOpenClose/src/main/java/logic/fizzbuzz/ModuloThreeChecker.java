package logic.fizzbuzz;

public class ModuloThreeChecker implements FizzBuzzCheck{
    @Override
    public boolean check(int number) {
        return number % 3 == 0;
    }

    @Override
    public void print() {
        System.out.println("Fizz");
    }
}
