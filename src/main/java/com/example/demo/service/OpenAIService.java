package com.example.demo.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.IOException;

public class OpenAIService {
    private static final String API_URL = "https://api.openai.com/v1/engines/davinci-codex/completions";
    private static final String API_KEY = "your-api-key-here";

    public String generateText(String prompt) throws IOException {
        OkHttpClient client = new OkHttpClient();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode requestBody = objectMapper.createObjectNode()
                .put("prompt", prompt)
                .put("max_tokens", 100);

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"), objectMapper.writeValueAsString(requestBody));

        Request request = new Request.Builder()
                .url(API_URL)
                .post(body)
                .addHeader("Authorization", "Bearer " + API_KEY)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            JsonNode responseBody = objectMapper.readTree(response.body().string());
            return responseBody.get("choices").get(0).get("text").asText();
        }
    }
}
