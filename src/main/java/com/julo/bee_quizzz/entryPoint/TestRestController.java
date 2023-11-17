package com.julo.bee_quizzz.entryPoint;

import com.julo.bee_quizzz.core.TestImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//nom des routes
@RequestMapping("/test")
public class TestRestController {
    @Autowired
    public TestRestController(TestImplementation testImplementation) {
        this.testImplementation = testImplementation;
    }

    private TestImplementation testImplementation;

    @GetMapping("/gettest")
    public String test (){
        return "ok";
    }

    @GetMapping("/gettest2")
    public String testTwo (){
        return testImplementation.testImplementation();
    }
}
