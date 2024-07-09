package logic.fizzbuzz;

public class ModuloThreeAndFiveChecker implements FizzBuzzCheck{
    @Override
    public boolean check(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    @Override
    public void print() {
        System.out.println("FizzBuzz");
    }
}
