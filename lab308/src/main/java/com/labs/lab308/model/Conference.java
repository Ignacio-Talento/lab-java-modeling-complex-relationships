package com.labs.lab308.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Speaker> speakers = new ArrayList<>();

    public Conference() {
    }

    public Conference(LocalDate date, Integer duration, String location, String title) {
        super(date, duration, location, title);
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "id=" + getId() +
                ", date=" + getDate() +
                ", duration=" + getDuration() +
                ", location='" + getLocation() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", speakersCount=" + speakers.size() +
                '}';
    }
}
