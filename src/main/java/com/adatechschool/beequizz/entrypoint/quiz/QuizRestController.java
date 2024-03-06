package com.adatechschool.beequizz.entrypoint.quiz;

import com.adatechschool.beequizz.core.question.Question;
import com.adatechschool.beequizz.core.question.QuestionService;
import com.adatechschool.beequizz.dataProvider.question.QuestionModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizRestController {
    private final QuestionService questionService;

    public QuizRestController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(value = "/{chapter_id}/{difficulty}")

    public Question<List<Question>> makeQuiz(
            @PathVariable("chapter_id") Long chapterId,
            @PathVariable("difficulty") String difficulty) {
//TODO: Récupérer les questions depuis la base de données et les renvoyer

        // Utilise le QuestionRepository pour récupérer les questions depuis la base de données
        List<Question> questions = questionService.findByChapterIdAndDifficulty(chapterId, difficulty);

    }
}

    // Get all questions
    @GetMapping
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

}