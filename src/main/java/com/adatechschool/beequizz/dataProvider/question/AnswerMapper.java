package com.adatechschool.beequizz.dataProvider.question;

import com.adatechschool.beequizz.core.question.Answer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AnswerMapper {
    // transforme AnswerModel vers entité Question
    List<Answer> mapAnswerModelToAnswerEntity(List<AnswerModel> answerModels);
}
