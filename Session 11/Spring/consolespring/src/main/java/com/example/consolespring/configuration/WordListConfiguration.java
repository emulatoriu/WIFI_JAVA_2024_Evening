package com.example.consolespring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WordListConfiguration {
    @Bean
    List<String> words() {
        return new ArrayList<>();
    }
    @Bean
    List<String> words1() {
        return new ArrayList<>(List.of("Hallo"));
    }
}
