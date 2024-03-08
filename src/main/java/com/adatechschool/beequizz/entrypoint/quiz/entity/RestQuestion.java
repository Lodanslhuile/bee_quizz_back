package com.adatechschool.beequizz.entrypoint.quiz.entity;

import java.util.List;


public class RestQuestion {
    private Long idQuestion;
    private String textQuestion;
    private Integer difficultyQuestion;
    private List<RestAnswer> answers;

    public RestQuestion() {
    }

    public Long getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Long idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public Integer getDifficultyQuestion() {
        return difficultyQuestion;
    }

    public void setDifficultyQuestion(Integer difficultyQuestion) {
        this.difficultyQuestion = difficultyQuestion;
    }

    public List<RestAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<RestAnswer> answers) {
        this.answers = answers;
    }
}
