package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/config")
public class ConfigController {

    @Value("${spring.application.name:Default App Name}")
    private String appName;

    @Value("${app.timeout:1000}")
    private int timeout;

    @GetMapping
    public String getConfig() {
        return String.format("App Name: %s, Timeout: %d ms", appName, timeout);
    }
}