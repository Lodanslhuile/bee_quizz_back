package com.adatechschool.beequizz.entrypoint.quiz.entity;

import java.util.List;

public class RestQuiz {
    private List<RestQuestion> questions;

    public RestQuiz() {
    }

    public List<RestQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<RestQuestion> questions) {
        this.questions = questions;
    }
}
