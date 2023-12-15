package com.adatechschool.beequizz.repository;

import com.adatechschool.beequizz.model.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionModel, Long> {
}
