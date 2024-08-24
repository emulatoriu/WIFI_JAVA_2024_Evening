package com.example.consolespring.logic;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WordService {
    public String getSentenceBackwords(List<String> words) {
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
