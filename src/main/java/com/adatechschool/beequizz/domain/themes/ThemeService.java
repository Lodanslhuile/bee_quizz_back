package com.adatechschool.beequizz.domain.themes;

import com.adatechschool.beequizz.domain.themes.connector.GetThemeConnector;
import com.adatechschool.beequizz.domain.themes.entity.Theme;
import com.adatechschool.beequizz.entrypoint.themes.connector.GetThemeUseCase;
import com.adatechschool.beequizz.entrypoint.themes.entity.RestTheme;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeService implements GetThemeUseCase {
    private final GetThemeConnector getThemeConnector;
    private final ThemeToRestThemeMapper themeToRestThemeMapper;

    public ThemeService(GetThemeConnector getThemeConnector, ThemeToRestThemeMapper themeToRestThemeMapper) {
        this.getThemeConnector = getThemeConnector;

        this.themeToRestThemeMapper = themeToRestThemeMapper;
    }

    @Override
    public List<RestTheme> getAllThemes() {

        List<Theme> themes = getThemeConnector.getAllThemes();
        return themeToRestThemeMapper.mapToRestThemesList(themes);
    }
}
