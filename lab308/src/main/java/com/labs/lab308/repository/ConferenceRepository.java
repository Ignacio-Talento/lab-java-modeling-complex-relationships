package com.labs.lab308.repository;

import com.labs.lab308.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Long> {

    @Query("SELECT c FROM Conference c JOIN c.speakers s WHERE s.name LIKE %:speakerName%")
    List<Conference> findBySpeakerNameContaining(String speakerName);

    @Query("SELECT c FROM Conference c JOIN c.speakers s GROUP BY c HAVING COUNT(s) > :minSpeakers")
    List<Conference> findConferencesWithMoreThanXSpeakers(int minSpeakers);
}
