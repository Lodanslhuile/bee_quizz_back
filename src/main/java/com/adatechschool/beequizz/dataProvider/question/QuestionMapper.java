package com.adatechschool.beequizz.dataProvider.question;

import com.adatechschool.beequizz.dataProvider.question.entity.AnswerModel;
import com.adatechschool.beequizz.dataProvider.question.entity.QuestionModel;
import com.adatechschool.beequizz.domain.quiz.entity.Answer;
import com.adatechschool.beequizz.domain.quiz.entity.Question;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapper {
    List<Question> mapToQuestion(List<QuestionModel> questionModel);

    Question mapToQuestion(QuestionModel questionModel);

    Answer mapToAnswer(AnswerModel answerModel);

}
