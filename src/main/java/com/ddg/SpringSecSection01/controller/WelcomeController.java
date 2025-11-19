package com.ddg.SpringSecSection01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    // REST API endpoint for welcome
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Security";
    }
}
