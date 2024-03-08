package com.adatechschool.beequizz.domain.quiz;

import com.adatechschool.beequizz.domain.quiz.entity.Answer;
import com.adatechschool.beequizz.domain.quiz.entity.Question;
import com.adatechschool.beequizz.domain.quiz.entity.Quiz;
import com.adatechschool.beequizz.entrypoint.quiz.entity.RestAnswer;
import com.adatechschool.beequizz.entrypoint.quiz.entity.RestQuestion;
import com.adatechschool.beequizz.entrypoint.quiz.entity.RestQuiz;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuizMapper {
    public RestQuiz mapToRestQuiz(Quiz quiz);

    public RestQuestion mapToRestQuestion(Question question);

    public RestAnswer mapToRestAnswer(Answer answer);

    public List<RestQuestion> mapToRestQuestions(List<Question> questions);

    public List<RestAnswer> mapToRestAnswers(List<Answer> answers);
}
