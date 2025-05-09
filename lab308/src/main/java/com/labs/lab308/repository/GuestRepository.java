package com.labs.lab308.repository;

import com.labs.lab308.model.Guest;
import com.labs.lab308.model.ResponseStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

    List<Guest> findByEventId(Long eventId);

    List<Guest> findByEventIdAndStatus(Long eventId, ResponseStatus status);

    List<Guest> findByNameContainingIgnoreCase(String name);

    List<Guest> findByStatus(ResponseStatus status);
}
