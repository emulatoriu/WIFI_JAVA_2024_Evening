package com.example.helloworld.logic;

import org.springframework.stereotype.Component;

@Component
public class WorldClass {
    private final String world = "World";

    public String getWorld() {
        return world;
    }
}
