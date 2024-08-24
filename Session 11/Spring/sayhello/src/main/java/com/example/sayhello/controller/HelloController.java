package com.example.sayhello.controller;

import com.example.sayhello.data.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    @RequestMapping("hello")
    String sayHello() {
        return "Hello, how are you doing?";
    }

    @GetMapping("joke")
    String tellJoke() {
        return "Chuck Norris drückt str+alt+entf mit einem Finger!";
    }

    @PostMapping
    String personalizedMessage(@RequestBody Person person) {
        return "Hello " + person.name();
    }
}
