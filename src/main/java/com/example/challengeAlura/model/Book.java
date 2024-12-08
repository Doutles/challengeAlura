package com.example.challengeAlura.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Book {

    private Long id;                     // ID del libro
    private String title;                // Título del libro
    private List<Person> authors;        // Lista de autores del libro
    private List<Person> translators;    // Lista de traductores del libro
    private List<String> subjects;       // Lista de temas relacionados con el libro
    private List<String> bookshelves;    // Lista de estantes en los que se encuentra el libro
    private List<String> languages;     // Lista de idiomas disponibles para el libro
    private Boolean copyright;           // Si el libro tiene derechos de autor
    private String mediaType;
    @JsonIgnore// Tipo de medio del libro (por ejemplo, texto, audio)
    private List<String> formats;        // Formatos en los que está disponible el libro
    private int downloadCount;           // Número de veces que se ha descargado el libro

    // Getter y Setter para id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter y Setter para title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter y Setter para authors
    public List<Person> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Person> authors) {
        this.authors = authors;
    }

    // Getter y Setter para translators
    public List<Person> getTranslators() {
        return translators;
    }

    public void setTranslators(List<Person> translators) {
        this.translators = translators;
    }

    // Getter y Setter para subjects
    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    // Getter y Setter para bookshelves
    public List<String> getBookshelves() {
        return bookshelves;
    }

    public void setBookshelves(List<String> bookshelves) {
        this.bookshelves = bookshelves;
    }

    // Getter y Setter para languages
    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    // Getter y Setter para copyright
    public Boolean getCopyright() {
        return copyright;
    }

    public void setCopyright(Boolean copyright) {
        this.copyright = copyright;
    }

    // Getter y Setter para mediaType
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    // Getter y Setter para formats
    public List<String> getFormats() {
        return formats;
    }

    public void setFormats(List<String> formats) {
        this.formats = formats;
    }

    // Getter y Setter para downloadCount
    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }
}
