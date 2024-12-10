package com.example.challengeAlura.controller;




import com.example.challengeAlura.model.Book;
import com.example.challengeAlura.model.BookListResponse;
import com.example.challengeAlura.service.GutendexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/books")
public class BookController {

    private final GutendexService gutendexService;


    @Autowired
    public BookController(GutendexService gutendexService) {
        this.gutendexService = gutendexService;

    }

    @GetMapping("/search")
    public BookListResponse searchBooks(@RequestParam String query) {
        return gutendexService.searchBooksByTitle(query);
    }

    // Nuevo endpoint para obtener el primer libro
    @GetMapping("/search/first")
    public Book searchFirstBook(@RequestParam String query) {
        return gutendexService.searchFirstBookByTitle(query);

    }





}

