package com.adatechschool.beequizz.entrypoint.quiz;

import com.adatechschool.beequizz.entrypoint.quiz.connector.GetQuizUseCase;
import com.adatechschool.beequizz.entrypoint.quiz.entity.RestQuiz;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
@CrossOrigin(origins = "*")
public class QuizRestService {
    private final GetQuizUseCase getQuizUseCase;

    public QuizRestService(GetQuizUseCase getQuizUseCase) {
        this.getQuizUseCase = getQuizUseCase;
    }

    @GetMapping(value = "", params = {"chapterId", "difficulty"})
    public RestQuiz getQuiz(@RequestParam(name = "chapterId") Integer chapterId,
                            @RequestParam(name = "difficulty") Integer difficulty) {
        if (chapterId == null || difficulty == null) {
            throw new IllegalArgumentException("chapterId and difficulty are required");
        }
        return getQuizUseCase.getQuiz(chapterId, difficulty);
    }
}
