package com.adatechschool.beequizz.dataProvider.question;

import org.springframework.stereotype.Service;

@Service
public class QuestionRepositoryService {
    private final QuestionMapper questionMapper;
    private final QuestionRepository questionRepository;

    public QuestionRepositoryService(QuestionMapper questionMapper, QuestionRepository questionRepository) {
        this.questionMapper = questionMapper;
        this.questionRepository = questionRepository;
    }

}
