package com.example.helloworld.logic;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldCombiner {
    private final HelloClass helloClass;
    private final WorldClass worldClass;

    public HelloWorldCombiner(HelloClass helloClass, WorldClass worldClass) {
        this.helloClass = helloClass;
        this.worldClass = worldClass;
    }

    public String getHelloWorld() {
        return helloClass.getHello() + " " + worldClass.getWorld();
    }
}
