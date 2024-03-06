package com.adatechschool.beequizz.entrypoint.quiz;

import com.adatechschool.beequizz.entrypoint.quiz.connector.GetQuizUseCase;
import com.adatechschool.beequizz.entrypoint.quiz.entity.RestQuiz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizRestService {
    private final GetQuizUseCase getQuizUseCase;

    public QuizRestService(GetQuizUseCase getQuizUseCase) {
        this.getQuizUseCase = getQuizUseCase;
    }

    @GetMapping(value = "/{chapterId}/{difficulty}")

    public RestQuiz getQuiz(
            @PathVariable("chapterId") Integer chapterId,
            @PathVariable("difficulty") Integer difficulty
    ) {

        return getQuizUseCase.getQuiz(chapterId, difficulty);
    }
}
