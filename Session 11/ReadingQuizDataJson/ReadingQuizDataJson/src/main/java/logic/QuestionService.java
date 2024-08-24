package logic;

import data.Question;

import java.util.Collections;
import java.util.List;

public class QuestionService {
    public List<String> getAnswersOfQuestionShuffled(Question firstQuestion) {
        List<String> answersQuestion1 = firstQuestion.wrongAnswers();
        answersQuestion1.add(firstQuestion.correctAnswer());
        Collections.shuffle(answersQuestion1);
        return answersQuestion1;
    }
}
