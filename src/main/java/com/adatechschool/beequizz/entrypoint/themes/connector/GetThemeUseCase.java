package com.adatechschool.beequizz.entrypoint.themes.connector;

import com.adatechschool.beequizz.entrypoint.themes.entity.RestTheme;

import java.util.List;

public interface GetThemeUseCase {
    public List<RestTheme> getAllThemes();

}
