package com.chucknorrisjokeinator.jokinator.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class JokesServiceConfiguration {
    @Bean
    Random random() {
        return new Random();
    }
}
