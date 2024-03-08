package com.adatechschool.beequizz.domain.themes;

import com.adatechschool.beequizz.domain.themes.entity.Theme;
import com.adatechschool.beequizz.entrypoint.themes.entity.RestTheme;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ThemeToRestThemeMapper {

    public List<RestTheme> mapToRestThemesList(List<Theme> themes);

    public RestTheme mapToRestThemes(Theme theme);


}
