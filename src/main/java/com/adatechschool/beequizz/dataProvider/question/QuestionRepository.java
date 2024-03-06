package com.adatechschool.beequizz.dataProvider.question;

import com.adatechschool.beequizz.dataProvider.question.entity.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionModel, Long> {
}