package com.chucknorrisjokeinator.jokinator.repository;

import com.chucknorrisjokeinator.jokinator.data.Joke;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class JokeRepository {
    private final List<Joke> jokes;

    public Joke add(Joke joke) {
        jokes.add(joke);
        return joke;
    }

    public List<Joke> getAll() {
        return jokes;
    }

}
