package logic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordServiceTest {

    @ParameterizedTest
    @MethodSource("init")
    void getStringWithAllowedCharacters(String sentence, List<String> forbiddenCharacters, String expected) {
        WordService wordService = new WordService();
        String result = wordService.getStringWithAllowedCharacters(sentence, forbiddenCharacters);
        assertEquals(expected, result);
    }

    static Stream<Arguments> init() {
        return Stream.of(
                Arguments.of("aaaabbbbccccd", List.of("a", "b", "c"), "d"),
                Arguments.of("aeiou", List.of("a", "e", "i", "o", "u"), ""),
                Arguments.of("Abraham fragt Bebraham, kann ich deine Zebra habn?", List.of("A", "a", "e", "i", "o", "u"), "brhm frgt Bbrhm, knn ch dn Zbr hbn?")
        );
    }


}