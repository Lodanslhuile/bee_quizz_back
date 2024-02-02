package com.adatechschool.beequizz.service;

import com.adatechschool.beequizz.dataProvider.model.QuestionModel;

import java.util.List;
import java.util.Optional;

public interface QuestionServiceInterface {
    QuestionModel createQuestion(QuestionModel questionModel);

    List<QuestionModel> getAllQuestions();

    Optional<QuestionModel> getQuestionById(Long id);

    QuestionModel updateQuestion(Long id, QuestionModel questionModelDetails);

    void deleteAllQuestions();

    void deleteQuestion(Long id);
}
