package com.example.helloworld.logic;

import org.springframework.stereotype.Component;

@Component
public class HelloClass {
    private final String hello = "Hello";

    public String getHello() {
        return hello;
    }
}
