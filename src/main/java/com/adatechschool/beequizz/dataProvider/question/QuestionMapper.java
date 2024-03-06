package com.adatechschool.beequizz.dataProvider.question;

import com.adatechschool.beequizz.core.question.Question;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    // transforme QuestionModel vers entité Question
    public List<Question> mapQuestionModelToQuestionEntity(List<QuestionModel> questionModel);
}
