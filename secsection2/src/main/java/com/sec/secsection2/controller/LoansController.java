package com.sec.secsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome to Spring Application with out security";
    }
}
