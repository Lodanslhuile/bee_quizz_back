package com.adatechschool.beequizz.core;

import org.springframework.stereotype.Component;

@Component
public class TestController implements TestImplementation {
    @Override
    public String testImplementation(){
        return "ok2";
    }
}
