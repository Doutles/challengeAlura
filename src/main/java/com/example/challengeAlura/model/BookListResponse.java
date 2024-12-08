package com.example.challengeAlura.model;

import java.util.List;

public class BookListResponse {

    private int count;           // El número total de resultados disponibles
    private String next;         // La URL para la siguiente página de resultados (si existe)
    private String previous;     // La URL para la página anterior de resultados (si existe)
    private List<Book> results;  // Lista de libros que se obtienen en la búsqueda

    // Getter y Setter para count
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // Getter y Setter para next
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    // Getter y Setter para previous
    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    // Getter y Setter para results
    public List<Book> getResults() {
        return results;
    }

    public void setResults(List<Book> results) {
        this.results = results;
    }
}
