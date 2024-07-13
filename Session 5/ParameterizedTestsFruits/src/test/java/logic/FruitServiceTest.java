package logic;

import data.Fruit;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FruitServiceTest {

    @ParameterizedTest
    @ValueSource(strings = {"Banana", "Apples", "Watermelon"})
    void isNameLongerThanFiveCharacter(String name) {
        FruitService fruitService = new FruitService();
        boolean result = fruitService.isNameLongerThanFiveCharacter(name);
        //assertEquals(true, result);

        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"Apple, Watermelon, Watermelon",
            "Banana, Kiwi, Banana",
            "a, aa, aa"})
    void getLongerFruitName(String fruit1, String fruit2, String expected) {
        FruitService fruitService = new FruitService();
        String result = fruitService.getLongerFruitName(fruit1, fruit2);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("initializeFruits")
    void getFruitsWithMinHealth(List<Fruit> fruits, int minHealthIndicator, List<Fruit> expected) {
        FruitService fruitService = new FruitService();
        List<Fruit> result = fruitService.getFruitsWithMinHealth(fruits, minHealthIndicator);

        assertEquals(expected, result);
    }

    static Stream<Arguments> initializeFruits() {
        Fruit lemon = new Fruit("Lemon", 9);
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                                new Fruit("Banana", 5),
                                new Fruit("Apple", 8),
                                new Fruit("Cherry", 6))
                        ), 6, List.of(new Fruit("Apple", 8),
                                new Fruit("Cherry", 6)),
                        Arguments.of(new ArrayList<>(List.of(
                                        lemon,
                                        new Fruit("Melon", 8),
                                        new Fruit("Orange", 8))
                                ), 9, List.of(lemon),
                                Arguments.of(new ArrayList<>(List.of()), 1, List.of()
                                ))));
    }
}