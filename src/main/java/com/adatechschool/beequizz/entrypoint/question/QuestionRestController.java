package com.adatechschool.beequizz.entrypoint.question;

import com.adatechschool.beequizz.core.question.Question;
import com.adatechschool.beequizz.core.question.QuestionService;
import com.adatechschool.beequizz.dataProvider.question.QuestionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/questions")
public class QuestionRestController {
    @Autowired
    private QuestionService questionService;

    // Create new question
    @PostMapping
    public QuestionModel createQuestion(@RequestBody QuestionModel questionModel) {
        return questionService.createQuestion(questionModel);
    }

    // Notre requete arrive ici j'aurai du appeler un connecteur et non pas mon service en direct.
    // Get all questions and related answers
    @GetMapping
    public List<Question> getAllQuestionsAndRelatedAnswers() {
        return questionService.getAllQuestions();
    }

    //Get question by ID
    @GetMapping("/{id}")
    public Optional<QuestionModel> getQuestionById(@PathVariable Long id) {
        return questionService.getQuestionById(id);
    }

    // Update question by ID
    @PutMapping("/{id}")
    public QuestionModel updateQuestion(@PathVariable Long id, @RequestBody QuestionModel questionModelDetails) {
        return questionService.updateQuestion(id, questionModelDetails);
    }
}
