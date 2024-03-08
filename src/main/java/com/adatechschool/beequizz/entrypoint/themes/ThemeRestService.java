package com.adatechschool.beequizz.entrypoint.themes;

import com.adatechschool.beequizz.entrypoint.themes.connector.GetThemeUseCase;
import com.adatechschool.beequizz.entrypoint.themes.entity.RestTheme;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/themes")
@CrossOrigin(origins = "*")
public class ThemeRestService {

    private final GetThemeUseCase getThemeUseCase;

    public ThemeRestService(GetThemeUseCase getThemeUseCase) {

        this.getThemeUseCase = getThemeUseCase;
    }

    @GetMapping(value = "")
    public List<RestTheme> getAllThemes() {
        return getThemeUseCase.getAllThemes();
    }
}
