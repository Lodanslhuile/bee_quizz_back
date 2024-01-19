package com.adatechschool.beequizz.dataProvider.question;

import com.adatechschool.beequizz.core.question.Question;
import com.adatechschool.beequizz.dataProvider.question.model.QuestionMapper;
import com.adatechschool.beequizz.dataProvider.question.model.QuestionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionRepositoryService {
    @Autowired
    private QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    public QuestionRepositoryService(QuestionMapper questionMapper) {
        this.questionMapper = questionMapper;
    }

    public List<Question> getAllQuestions() {
        List<QuestionModel> allQuestions = questionRepository.findAll();
        return questionMapper.toQuestion(allQuestions);
    }
}
