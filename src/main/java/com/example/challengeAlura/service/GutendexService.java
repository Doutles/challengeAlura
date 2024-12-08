package com.example.challengeAlura.service;


import com.example.challengeAlura.model.BookListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GutendexService {
    private final RestTemplate restTemplate;
    private final String apiUrl = "https://gutendex.com/books";

    @Autowired
    public GutendexService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public BookListResponse searchBooksByTitle(String title) {
        String url = apiUrl + "?search=" + title;
        return restTemplate.getForObject(url, BookListResponse.class);
    }
}

