package com.example.challengeAlura.service;


import com.example.challengeAlura.model.BookListResponse;
import com.example.challengeAlura.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

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


    public Book searchFirstBookByTitle(String query) {
        try {
            String url = "https://gutendex.com/books?search=" + URLEncoder.encode(query, StandardCharsets.UTF_8);
            var response = restTemplate.getForObject(url, BookListResponse.class);

            if (response != null && !response.getResults().isEmpty()) {
                return response.getResults().get(0); // Retorna el primer libro
            }
        } catch (Exception e) {
            System.err.println("Error al consultar la API de Gutendex: " + e.getMessage());
        }
        return null;
    }



}

//    public Book searchFirstBookByTitle(String title){
//        BookListResponse response = searchBooksByTitle(title);
//
//        // Verificar si hay resultados y devolver el primero si existe
//        if (response != null && response.getResults() != null && !response.getResults().isEmpty()) {
//            System.out.println("respuesta del libro");
//            System.out.println(response);
//            return response.getResults().get(0);
//        }
//
//        return null; // Retorna null si no hay resultados
//    }

