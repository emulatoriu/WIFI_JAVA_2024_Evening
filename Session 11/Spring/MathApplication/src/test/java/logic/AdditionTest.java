package logic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @ParameterizedTest
    @CsvSource({"5, 7, 12"})
    void calculate(double first, double second, double expected) {
        Calculate adder = new Addition();
        double result = adder.calculate(first, second);
        assertEquals(expected, result);

    }
}