package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${URL_A: default value}")
    private String exampleProperty;

    @Value("${another.value: 0}")
    private int anotherValue;

    @GetMapping("/config")
    public String getConfig() {
        return String.format("example.property: %s, another.value: %d", exampleProperty, anotherValue);
    }
}
