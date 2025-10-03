package com.example.countries_tech1.Controller;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class WelcomeController {


    @RestController
    public class welcomeController {

        @GetMapping("/")
        public String welcome(Model model) {
            return "Welcome to the countries website!";
        }
    }
}
