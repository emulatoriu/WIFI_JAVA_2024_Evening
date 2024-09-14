package com.chucknorrisjokeinator.jokinator.logic;

import com.chucknorrisjokeinator.jokinator.data.Joke;
import com.chucknorrisjokeinator.jokinator.exception.JokeAlreadyExistsException;
import com.chucknorrisjokeinator.jokinator.repository.JokeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
@AllArgsConstructor
public class JokeService {
    private final JokeRepository jokeRepository;
    private final RandomService randomService;
    public Joke add(Joke joke) {
        boolean jokeExists = doesJokeExist(joke);
        if(jokeExists) throw new JokeAlreadyExistsException();
        UUID id = UUID.randomUUID();
        Joke newJoke = new Joke(id.toString(), joke.userName(), joke.joke());
        return jokeRepository.add(newJoke);
    }

    public boolean doesJokeExist(Joke joke)  {
        return jokeRepository.getAll().stream()
                .anyMatch(joke1 -> joke1.joke().equalsIgnoreCase(joke.joke()));
    }

    public List<String> getAll() {
        return jokeRepository.getAll().stream()
                .map(Joke::joke)
                .toList();
    }

    public String getRandomJoke() {
        List<Joke> allJokes = jokeRepository.getAll();
        int amountJokes = allJokes.size();
        int randomIndex = randomService.getRandomNumber(0, amountJokes);
        Joke randomJoke = allJokes.get(randomIndex);
        return randomJoke.joke();
    }
}
