package com.example.demo.repository;

import com.example.demo.model.DynamicPriceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DynamicPriceRecordRepository extends JpaRepository<DynamicPriceRecord, Long> {

    // All records for an event, sorted by computedAt descending
    List<DynamicPriceRecord> findByEventIdOrderByComputedAtDesc(Long eventId);

    // Latest record for an event
    Optional<DynamicPriceRecord> findFirstByEventIdOrderByComputedAtDesc(Long eventId);
}