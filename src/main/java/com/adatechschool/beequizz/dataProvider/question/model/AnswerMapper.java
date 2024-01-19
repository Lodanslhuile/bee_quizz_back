package com.adatechschool.beequizz.dataProvider.question.model;

import com.adatechschool.beequizz.core.question.Answer;
import com.adatechschool.beequizz.dataProvider.question.model.AnswerModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AnswerMapper {

    Answer toAnswer(AnswerModel answerModel);

    List<Answer> toAnswers(List<AnswerModel> answerModels);
}
