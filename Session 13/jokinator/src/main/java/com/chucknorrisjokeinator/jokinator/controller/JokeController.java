package com.chucknorrisjokeinator.jokinator.controller;

import com.chucknorrisjokeinator.jokinator.data.Joke;
import com.chucknorrisjokeinator.jokinator.logic.JokeService;
import com.chucknorrisjokeinator.jokinator.repository.JokeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
public class JokeController {
    private final JokeService jokeService;
    @PostMapping("tellJoke")
    String listenToJoke(@RequestBody String joke) {
        System.out.println(joke);
        return "Thanks for the nice joke";
    }

    @PostMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    Joke addJoke(@RequestBody Joke joke) {
        Joke addedJoke = jokeService.add(joke);
        return addedJoke;
    }

    @GetMapping("getAll")
    List<String> getAll() {
        return jokeService.getAll();
    }

    @GetMapping("randomJoke")
    String getRandomJoke() {
        return jokeService.getRandomJoke();
    }

}
