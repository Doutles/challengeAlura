package com.example.challengeAlura.repository;

import com.example.challengeAlura.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

    // Método para buscar libros por título (opcional)
    List<BookEntity> findAllByTitleContainingIgnoreCase(String title);
}