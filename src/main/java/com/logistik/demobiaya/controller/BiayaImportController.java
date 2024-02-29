package com.logistik.demobiaya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/biaya")
public class BiayaImportController {
    @GetMapping
    public String welcome() {
        return "Welcome to Spring Boot REST API";
    }
}
