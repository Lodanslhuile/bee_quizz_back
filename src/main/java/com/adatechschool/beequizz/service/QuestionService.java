package com.adatechschool.beequizz.service;

import com.adatechschool.beequizz.model.Question;
import com.adatechschool.beequizz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
// This class allows us to treat the business logic related to questions
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    // Create new question
    public Question createQuestion(Question question){

        return questionRepository.save(question);
    }

    // Get all questions
    public List<Question> getAllQuestions(){

        return questionRepository.findAll();
    }

    // Get question by ID
    public Optional<Question> getQuestionById(Long id) {

        return questionRepository.findById(id);
    }

    // Update question
    public Question updateQuestion(Long id, Question questionDetails){
       Optional<Question> question = questionRepository.findById(id);
       if (question.isPresent()) {
           Question existingQuestion = question.get();
           existingQuestion.setTextQuestion(questionDetails.getTextQuestion());
           existingQuestion.setDifficultyQuestion(questionDetails.getDifficultyQuestion());
           return questionRepository.save(existingQuestion);
       }
       return null;
    }

    // Delete all questions
    public void deleteAllQuestions(){

        questionRepository.deleteAll();
    }

    // Delete question
    public void deleteQuestion(Long id){

        questionRepository.deleteById(id);
    }
}
