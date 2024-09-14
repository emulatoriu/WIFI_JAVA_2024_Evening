package com.chucknorrisjokeinator.jokinator.configuration;

import com.chucknorrisjokeinator.jokinator.data.Joke;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class JokesRepositoryConfiguration {
    @Bean
    List<Joke> jokes() {
        return new ArrayList<>();
    }
}
