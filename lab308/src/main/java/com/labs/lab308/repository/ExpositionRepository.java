package com.labs.lab308.repository;

import com.labs.lab308.model.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpositionRepository extends JpaRepository<Exposition, Long> {

    // Custom query methods specific to Exposition can be added here
    List<Exposition> findByLocationContainingIgnoreCase(String location);
}
