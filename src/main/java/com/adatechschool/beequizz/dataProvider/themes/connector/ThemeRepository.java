package com.adatechschool.beequizz.dataProvider.themes.connector;

import com.adatechschool.beequizz.dataProvider.themes.entity.ThemeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeRepository extends JpaRepository<ThemeModel, Integer> {
}
