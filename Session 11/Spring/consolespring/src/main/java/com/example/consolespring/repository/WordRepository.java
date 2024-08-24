package com.example.consolespring.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WordRepository {
    private final List<String> words;

    public WordRepository(List<String> words) {
        this.words = words;
    }

    public List<String> getWords() {
        return words;
    }
}
