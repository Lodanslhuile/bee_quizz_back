package com.adatechschool.beequizz.dataProvider.question;

import com.adatechschool.beequizz.core.question.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionRepositoryService {
    private final QuestionMapper questionMapper;
    private final QuestionRepository questionRepository;

    public QuestionRepositoryService(QuestionMapper questionMapper, QuestionRepository questionRepository) {
        this.questionMapper = questionMapper;
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        List<QuestionModel> allQuestions = questionRepository.findAll();
        return questionMapper.mapQuestionModelToQuestionEntity(allQuestions);
    }
}
