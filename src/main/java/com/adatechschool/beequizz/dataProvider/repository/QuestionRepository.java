package com.adatechschool.beequizz.dataProvider.repository;

import com.adatechschool.beequizz.dataProvider.model.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionModel, Long> {
}
