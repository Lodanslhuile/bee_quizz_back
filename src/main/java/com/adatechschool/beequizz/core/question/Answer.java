package com.adatechschool.beequizz.core.question;

public class Answer {

    private Long idAnswer;
    private String textAnswer;
    private Boolean correctAnswer;

    public Answer(Long idAnswer, String textAnswer, Boolean correctAnswer) {
        this.idAnswer = idAnswer;
        this.textAnswer = textAnswer;
        this.correctAnswer = correctAnswer;
    }

    public Long getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(Long idAnswer) {
        this.idAnswer = idAnswer;
    }

    public String getTextAnswer() {
        return textAnswer;
    }

    public void setTextAnswer(String textAnswer) {
        this.textAnswer = textAnswer;
    }

    public Boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
