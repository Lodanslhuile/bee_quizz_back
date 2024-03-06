package com.adatechschool.beequizz.entrypoint.quiz.connector;

import com.adatechschool.beequizz.entrypoint.quiz.entity.RestQuiz;

public interface GetQuizUseCase {
    public RestQuiz getQuiz(Integer chapterId, Integer difficulty);
}
