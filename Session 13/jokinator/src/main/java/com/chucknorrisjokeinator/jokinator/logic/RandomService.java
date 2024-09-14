package com.chucknorrisjokeinator.jokinator.logic;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class RandomService {
    private final Random random;

    public int getRandomNumber(int lowerBound, int upperBound) {
        return random.nextInt(lowerBound, upperBound);
    }
}
