package com.labs.lab308.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Exposition extends Event {

    // Additional fields specific to Exposition could be added here

    // Constructors
    public Exposition() {
    }

    public Exposition(LocalDate date, Integer duration, String location, String title) {
        super(date, duration, location, title);
    }

    @Override
    public String toString() {
        return "Exposition{" +
                "id=" + getId() +
                ", date=" + getDate() +
                ", duration=" + getDuration() +
                ", location='" + getLocation() + '\'' +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
