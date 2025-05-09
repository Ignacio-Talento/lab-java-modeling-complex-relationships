package com.labs.lab308.repository;

import com.labs.lab308.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {

    Optional<Chapter> findByName(String name);

    List<Chapter> findByDistrict(String district);
}
