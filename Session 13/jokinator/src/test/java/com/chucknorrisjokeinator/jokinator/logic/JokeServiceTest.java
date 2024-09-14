package com.chucknorrisjokeinator.jokinator.logic;

import com.chucknorrisjokeinator.jokinator.data.Joke;
import com.chucknorrisjokeinator.jokinator.exception.JokeAlreadyExistsException;
import com.chucknorrisjokeinator.jokinator.repository.JokeRepository;
import jdk.jfr.Description;
import lombok.AllArgsConstructor;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;


class JokeServiceTest {
    @Mock
    private RandomService randomService;
    @Mock
    private JokeRepository jokeRepository;
    @InjectMocks
    private JokeService jokeService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(jokeRepository.getAll()).thenReturn(List.of(
                        new Joke("", "user", "joke1"),
                        new Joke("", "user", "joke2")
        ));
        when(randomService.getRandomNumber(anyInt(), anyInt())).thenReturn(0);
    }

    @Test
    @DisplayName("Here is tested if an exception is thrown or not")
    void add_test_exception() {
        assertDoesNotThrow(() -> {
            jokeService.add(new Joke("", "", "joke3"));
        });
        assertThrows(JokeAlreadyExistsException.class, () -> {
            jokeService.add(new Joke("", "", "joke1"));
        });
    }

    @ParameterizedTest
    @MethodSource("initialiseJoke")
    void doesJokeExist(Joke joke, boolean expected) {
        boolean result = jokeService.doesJokeExist(joke);
        assertEquals(expected, result);
    }
    public static Stream<Arguments> initialiseJoke() {
        return Stream.of(
                Arguments.of(
                        new Joke("", "", "joke1"), true
                ),
                Arguments.of(
                        new Joke("", "", "joke2"), true
                ),
                Arguments.of(
                        new Joke("", "", "joke3"), false
                )
        );
    }

    @Test
    void getAll() {
    }

    @Test
    void getRandomJoke() {
        String joke = jokeService.getRandomJoke();
        verify(randomService, times(1)).getRandomNumber(anyInt(), anyInt());
        assertEquals("joke1", joke);
    }
}