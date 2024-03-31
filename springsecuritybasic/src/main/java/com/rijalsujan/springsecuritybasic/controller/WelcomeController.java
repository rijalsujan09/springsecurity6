package com.rijalsujan.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcome() {
        return "welcome to Spring Application with security";
    }
}
