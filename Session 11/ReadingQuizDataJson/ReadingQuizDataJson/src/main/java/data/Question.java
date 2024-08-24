package data;

import java.util.List;

public record Question(String question, String correctAnswer, List<String> wrongAnswers ) {
}
