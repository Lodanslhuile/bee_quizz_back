package com.adatechschool.beequizz.domain.quiz.connector;

import com.adatechschool.beequizz.domain.quiz.entity.Question;

import java.util.List;

public interface GetQuestionConnector {
    public List<Question> getQuestions(Integer chapterId, Integer difficulty);
}
