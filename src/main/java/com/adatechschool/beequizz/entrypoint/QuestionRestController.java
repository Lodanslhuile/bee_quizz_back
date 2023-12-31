package com.adatechschool.beequizz.entrypoint;

import com.adatechschool.beequizz.model.QuestionModel;
import com.adatechschool.beequizz.service.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/questions")
public class QuestionRestController {
    @Autowired
    private QuestionServiceImpl questionServiceImpl;

    // Create new question
    @PostMapping
    public QuestionModel createQuestion(@RequestBody QuestionModel questionModel) {
        return questionServiceImpl.createQuestion(questionModel);
    }

    // Get all questions
    @GetMapping
    public List<QuestionModel> getAllQuestions() {
        return questionServiceImpl.getAllQuestions();
    }

    //Get question by ID
    @GetMapping("/{id}")
    public Optional<QuestionModel> getQuestionById(@PathVariable Long id) {
        return questionServiceImpl.getQuestionById(id);
    }

    // Update question by ID
    @PutMapping("/{id}")
    public QuestionModel updateQuestion(@PathVariable Long id, @RequestBody QuestionModel questionModelDetails) {
        return questionServiceImpl.updateQuestion(id, questionModelDetails);
    }

    // Delete all questions
    @DeleteMapping
    public String deleteAllQuestions() {
        questionServiceImpl.deleteAllQuestions();
        return "All questions have been deleted successfully.";
    }

    // Delete question by ID
    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        questionServiceImpl.deleteQuestion(id);
    }
}
