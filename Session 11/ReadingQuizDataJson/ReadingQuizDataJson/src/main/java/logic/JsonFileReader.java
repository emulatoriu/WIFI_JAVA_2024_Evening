package logic;

import data.Question;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.QuestionsWrapper;

public class JsonFileReader {
    private final ObjectMapper objectMapper;

    public JsonFileReader(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<Question> readQuestions(File jsonFile) throws IOException {
        QuestionsWrapper questionsWrapper = objectMapper.readValue(jsonFile, QuestionsWrapper.class);
        return questionsWrapper.questions();
    }
}
