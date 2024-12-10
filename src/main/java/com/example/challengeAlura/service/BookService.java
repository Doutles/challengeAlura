package com.example.challengeAlura.service;

import com.example.challengeAlura.entity.AuthorEntity;
import com.example.challengeAlura.entity.BookEntity;
import com.example.challengeAlura.repository.BookRepository;
import com.example.challengeAlura.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    // Método para guardar un libro
    public BookEntity saveBook(BookEntity bookEntity) {
        // Guardar autores si no existen
        if (bookEntity.getAuthors() != null) {
            for (AuthorEntity authorEntity : bookEntity.getAuthors()) {
                // Si el autor no existe, se guarda en la base de datos
                if (authorEntity.getId() == null) {
                    authorRepository.save(authorEntity);
                }
            }
        }
        // Guardar el libro con sus autores
        return bookRepository.save(bookEntity);
    }

    // Método para buscar un libro por su título (opcional)
    public List<BookEntity> findBooksByTitle(String title) {
        return bookRepository.findAllByTitleContainingIgnoreCase(title);
    }
}
