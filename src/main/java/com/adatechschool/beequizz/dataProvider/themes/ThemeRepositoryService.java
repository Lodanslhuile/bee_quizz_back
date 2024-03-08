package com.adatechschool.beequizz.dataProvider.themes;

import com.adatechschool.beequizz.dataProvider.themes.connector.ThemeRepository;
import com.adatechschool.beequizz.dataProvider.themes.entity.ThemeModel;
import com.adatechschool.beequizz.domain.themes.connector.GetThemeConnector;
import com.adatechschool.beequizz.domain.themes.entity.Theme;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeRepositoryService implements GetThemeConnector {
    private final ThemeModeltoThemeMapper themeModeltoThemeMapper;
    private final ThemeRepository themeRepository;

    public ThemeRepositoryService(ThemeModeltoThemeMapper themeModeltoThemeMapper, ThemeRepository themeRepository) {
        this.themeModeltoThemeMapper = themeModeltoThemeMapper;
        this.themeRepository = themeRepository;
    }

    @Override
    public List<Theme> getAllThemes() {
        List<ThemeModel> themeModels = themeRepository.findAll();
        return themeModeltoThemeMapper.mapToTheme(themeModels);
    }
}
