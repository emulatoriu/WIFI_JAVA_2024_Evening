package com.example.helloworld.runner;

import com.example.helloworld.logic.HelloWorldCombiner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Application implements ApplicationRunner {
    private final HelloWorldCombiner helloWorldCombiner;
    public Application(HelloWorldCombiner helloWorldCombiner) {
        this.helloWorldCombiner = helloWorldCombiner;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(String.format("%s", helloWorldCombiner.getHelloWorld()));
    }
}
