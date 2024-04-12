package com.adatechschool.beequizz.dataProvider.question;

import com.adatechschool.beequizz.dataProvider.question.connector.QuestionRepository;
import com.adatechschool.beequizz.dataProvider.question.entity.QuestionModel;
import com.adatechschool.beequizz.domain.quiz.connector.GetQuestionConnector;
import com.adatechschool.beequizz.domain.quiz.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionRepositoryService implements GetQuestionConnector {
    private final QuestionMapper questionMapper;
    private final QuestionRepository questionRepository;

    public QuestionRepositoryService(QuestionMapper questionMapper, QuestionRepository questionRepository) {
        this.questionMapper = questionMapper;
        this.questionRepository = questionRepository;
    }

    @Override
    public List<Question> getQuestions(Integer chapterId, Integer difficulty) {
        List<QuestionModel> questionModels = questionRepository.findByChapterIdAndDifficultyQuestion(chapterId, difficulty);
        return questionMapper.mapToQuestion(questionModels);
    }
}
