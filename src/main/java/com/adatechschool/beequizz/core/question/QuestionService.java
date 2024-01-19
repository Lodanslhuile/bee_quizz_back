package com.adatechschool.beequizz.core.question;

import com.adatechschool.beequizz.dataProvider.question.QuestionRepositoryService;
import com.adatechschool.beequizz.dataProvider.question.model.QuestionModel;
import com.adatechschool.beequizz.dataProvider.question.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
// This class allows us to treat the business logic related to questions
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private QuestionRepositoryService questionRepositoryService;

    // Create new question
    public QuestionModel createQuestion(QuestionModel questionModel) {

        return questionRepository.save(questionModel);
    }

    // Get all questions
    public List<Question> getAllQuestions() {

        return questionRepositoryService.getAllQuestions();
    }

    // Get question by ID
    public Optional<QuestionModel> getQuestionById(Long id) {

        return questionRepository.findById(id);
    }

    // Update question
    public QuestionModel updateQuestion(Long id, QuestionModel questionModelDetails) {
        Optional<QuestionModel> question = questionRepository.findById(id);
        if (question.isPresent()) {
            QuestionModel existingQuestionModel = question.get();
            existingQuestionModel.setTextQuestion(questionModelDetails.getTextQuestion());
            existingQuestionModel.setDifficultyQuestion(questionModelDetails.getDifficultyQuestion());
            return questionRepository.save(existingQuestionModel);
        }
        return null;
    }

    // Delete all questions
    public void deleteAllQuestions() {

        questionRepository.deleteAll();
    }

    // Delete question
    public void deleteQuestion(Long id) {

        questionRepository.deleteById(id);
    }
}
