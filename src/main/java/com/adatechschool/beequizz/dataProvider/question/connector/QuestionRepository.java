package com.adatechschool.beequizz.dataProvider.question.connector;

import com.adatechschool.beequizz.dataProvider.question.entity.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<QuestionModel, Long> {
    List<QuestionModel> findByChapterIdAndDifficultyQuestion(Integer chapterId, Integer difficulty);
}