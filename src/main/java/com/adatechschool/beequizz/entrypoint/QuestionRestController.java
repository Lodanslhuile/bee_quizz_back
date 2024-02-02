package com.adatechschool.beequizz.entrypoint;

import com.adatechschool.beequizz.dataProvider.model.QuestionModel;
import com.adatechschool.beequizz.service.QuestionServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/questions")
public class QuestionRestController {
    private final QuestionServiceInterface questionServiceInterface;

    public QuestionRestController(QuestionServiceInterface questionServiceInterface) {
        this.questionServiceInterface = questionServiceInterface;
    }

    // Create new question
    @PostMapping
    public QuestionModel createQuestion(@RequestBody QuestionModel questionModel) {
        return questionServiceInterface.createQuestion(questionModel);
    }

    // Get all questions
    @GetMapping
    public List<QuestionModel> getAllQuestions() {
        return questionServiceInterface.getAllQuestions();
    }

    //Get question by ID
    @GetMapping("/{id}")
    public Optional<QuestionModel> getQuestionById(@PathVariable Long id) {
        return questionServiceInterface.getQuestionById(id);
    }

    // Update question by ID
    @PutMapping("/{id}")
    public QuestionModel updateQuestion(@PathVariable Long id, @RequestBody QuestionModel questionModelDetails) {
        return questionServiceInterface.updateQuestion(id, questionModelDetails);
    }

    // Delete all questions
    @DeleteMapping
    public String deleteAllQuestions() {
        questionServiceInterface.deleteAllQuestions();
        return "All questions have been deleted successfully.";
    }

    // Delete question by ID
    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        questionServiceInterface.deleteQuestion(id);
    }
}
