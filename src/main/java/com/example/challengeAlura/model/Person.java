package com.example.challengeAlura.model;

public class Person {

    private Integer birthYear;  // Año de nacimiento de la persona
    private Integer deathYear;  // Año de fallecimiento de la persona (si aplica)
    private String name;        // Nombre de la persona

    // Getter y Setter para birthYear
    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    // Getter y Setter para deathYear
    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    // Getter y Setter para name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
