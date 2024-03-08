package com.adatechschool.beequizz.domain.quiz.entity;

import java.util.List;


public class Question {
    private Long idQuestion;
    private String textQuestion;
    private Integer difficultyQuestion;
    private List<Answer> answers;

    public Question() {
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

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
