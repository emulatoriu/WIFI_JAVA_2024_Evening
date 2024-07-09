package logic.fizzbuzz;

public class ModuloSevenChecker implements FizzBuzzCheck{
    @Override
    public boolean check(int number) {
        return number % 7 == 0;
    }

    @Override
    public void print() {
        System.out.println("Bass");
    }
}
