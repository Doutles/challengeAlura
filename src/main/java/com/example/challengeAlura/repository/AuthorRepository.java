package com.example.challengeAlura.repository;

import com.example.challengeAlura.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

    // Puedes agregar consultas personalizadas si es necesario
}
