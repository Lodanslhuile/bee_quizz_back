package com.adatechschool.beequizz.dataProvider.themes;

import com.adatechschool.beequizz.dataProvider.themes.entity.ThemeModel;
import com.adatechschool.beequizz.domain.themes.entity.Theme;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ThemeModeltoThemeMapper {

    List<Theme> mapToTheme(List<ThemeModel> themeModel);

}
