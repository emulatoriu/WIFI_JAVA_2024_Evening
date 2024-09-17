package logic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordService {
    public String getStringWithAllowedCharacters(String sentence, List<String> forbiddenCharacters) {
        return Arrays.stream(sentence.split(""))
                .filter(c -> !forbiddenCharacters.contains(c))
                .collect(Collectors.joining());
    }
}
