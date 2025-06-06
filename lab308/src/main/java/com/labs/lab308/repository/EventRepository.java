package com.labs.lab308.repository;

import com.labs.lab308.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByDate(LocalDate date);

    List<Event> findByLocationContainingIgnoreCase(String location);

    List<Event> findByTitleContainingIgnoreCase(String title);
}
