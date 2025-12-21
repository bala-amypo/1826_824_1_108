package com.example.demo.repository;

import com.example.demo.model.EventRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRecordRepository extends JpaRepository<EventRecord, Long> {

    // Check if an EventRecord exists with the given eventCode
    boolean existsByEventCode(String eventCode);

    // Find an EventRecord by eventCode
    Optional<EventRecord> findByEventCode(String eventCode);
}
