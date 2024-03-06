package com.adatechschool.beequizz.dataProvider.question;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionModel, Long> {
}