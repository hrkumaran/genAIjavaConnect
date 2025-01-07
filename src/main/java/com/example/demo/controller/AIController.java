package com.example.demo.controller;

import com.example.demo.service.OpenAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class AIController {
    private final OpenAIService openAIService = new OpenAIService();

    @GetMapping("/ai_response")
    public String getAIResponse(@RequestParam String prompt) {
        try {
            return openAIService.generateText(prompt);
        } catch (IOException e) {
            return "Error: " + e.getMessage();
        }
    }
}

