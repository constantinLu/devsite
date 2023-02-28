package com.hub.devsite.devsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @GetMapping("/home")
    String getHome() {
        return "Welcome to Devsite Dashboard";
    }
}
