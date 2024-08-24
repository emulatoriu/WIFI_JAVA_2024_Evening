import com.fasterxml.jackson.databind.ObjectMapper;
import data.Question;
import logic.JsonFileReader;
import logic.QuestionService;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonFileReader jsonFileReader = new JsonFileReader(objectMapper);
        try {
            List<Question> questions = jsonFileReader.readQuestions(new File(Application.class.getResource("questions.json").toURI()));
            Collections.shuffle(questions);
            Question firstQuestion = questions.get(0);
            QuestionService questionService = new QuestionService();
            List<String> allAnswersQuestion1 = questionService.getAnswersOfQuestionShuffled(firstQuestion);
            System.out.println(firstQuestion.question());
            System.out.println(allAnswersQuestion1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
