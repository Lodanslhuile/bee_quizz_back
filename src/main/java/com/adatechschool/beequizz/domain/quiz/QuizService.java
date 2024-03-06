package com.adatechschool.beequizz.domain.quiz;

import com.adatechschool.beequizz.domain.quiz.connector.GetQuestionConnector;
import com.adatechschool.beequizz.domain.quiz.entity.Question;
import com.adatechschool.beequizz.domain.quiz.entity.Quiz;
import com.adatechschool.beequizz.entrypoint.quiz.connector.GetQuizUseCase;
import com.adatechschool.beequizz.entrypoint.quiz.entity.RestQuiz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService implements GetQuizUseCase {

    private final GetQuestionConnector getQuestionConnector;
    private final QuizMapper quizMapper;

    public QuizService(GetQuestionConnector getQuestionConnector, QuizMapper quizMapper) {
        this.getQuestionConnector = getQuestionConnector;
        this.quizMapper = quizMapper;
    }

    @Override
    public RestQuiz getQuiz(Integer chapterId, Integer difficulty) {
        List<Question> questions = getQuestionConnector.getQuestions(chapterId, difficulty);
        Quiz quiz = new Quiz(questions);
        return quizMapper.mapToRestQuiz(quiz);
    }
}
