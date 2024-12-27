package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@Configuration
public class ConfigClientController {

    @Value("${refresh.property: default value}")
    private String example;

    @GetMapping("/config")
    public String getConfig() {
        return String.format("example.property: %s", example);
    }
}
