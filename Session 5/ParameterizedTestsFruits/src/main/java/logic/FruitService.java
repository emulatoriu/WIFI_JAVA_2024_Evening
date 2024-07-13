package logic;

import data.Fruit;

import java.util.List;
import java.util.stream.Collectors;

public class FruitService {
    public boolean isNameLongerThanFiveCharacter(String name) {
        return name.length() > 5;
    }

    public String getLongerFruitName(String name1, String name2) {
        return name1.length() > name2.length()? name1 : name2;
    }

    public Double getAverageHelth(List<Integer> healthIndicators) {
        return healthIndicators.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }

    public List<Fruit> getFruitsWithMinHealth(List<Fruit> fruits, int minHealthIndicator) {
        return fruits.stream()
                .filter(fruit -> fruit.healthIndicator() >= minHealthIndicator)
                .toList();
    }
}
