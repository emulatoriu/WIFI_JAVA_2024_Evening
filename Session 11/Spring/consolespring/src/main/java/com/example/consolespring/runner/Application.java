package com.example.consolespring.runner;

import com.example.consolespring.logic.WordService;
import com.example.consolespring.repository.WordRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class Application implements ApplicationRunner {
    private final Scanner scanner;
    private final WordRepository wordRepository;
    private final WordService wordService;

    public Application(Scanner scanner, WordRepository wordRepository, WordService wordService) {
        this.scanner = scanner;
        this.wordRepository = wordRepository;
        this.wordService = wordService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String word = scanner.nextLine();
        List<String> words = wordRepository.getWords();

        while(!word.equalsIgnoreCase("exit")) {
            words.add(word);
            word = scanner.nextLine();
        }
        String sentence = wordService.getSentenceBackwords(words);
        System.out.println(sentence);

    }
}
