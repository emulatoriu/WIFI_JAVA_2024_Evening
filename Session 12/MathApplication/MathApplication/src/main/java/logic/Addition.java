package logic;

public class Addition implements Calculate{
    @Override
    public double calculate(double first, double second) {
        return first + second;
    }
}
