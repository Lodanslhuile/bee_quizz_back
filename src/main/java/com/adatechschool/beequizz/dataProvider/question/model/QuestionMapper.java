package com.adatechschool.beequizz.dataProvider.question.model;

import com.adatechschool.beequizz.core.question.Question;
import com.adatechschool.beequizz.dataProvider.question.model.QuestionModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapper {
    public List<Question> toQuestion(List<QuestionModel> questionModel);
}
