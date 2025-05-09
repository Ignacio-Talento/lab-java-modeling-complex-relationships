package com.labs.lab308.repository;

import com.labs.lab308.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

    List<Speaker> findByConferenceId(Long conferenceId);

    List<Speaker> findByNameContainingIgnoreCase(String name);

    List<Speaker> findByPresentationDurationGreaterThanEqual(Integer minDuration);

    List<Speaker> findByConferenceIdOrderByPresentationDurationDesc(Long conferenceId);
}
