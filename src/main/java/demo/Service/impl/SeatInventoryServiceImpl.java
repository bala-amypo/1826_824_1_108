package com.example.demo.service.impl;

import com.example.demo.entity.SeatInventoryRecord;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.SeatInventoryRecordRepository;
import com.example.demo.service.SeatInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatInventoryServiceImpl implements SeatInventoryService {

    @Autowired
    private SeatInventoryRecordRepository repository;

    @Override
    public SeatInventoryRecord create(SeatInventoryRecord record) {
        return repository.save(record);
    }

    @Override
    public SeatInventoryRecord getByEvent(Long eventId) {
        return repository.findByEventId(eventId)
                .orElseThrow(() -> new NotFoundException("Seat inventory not found"));
    }

    @Override
    public SeatInventoryRecord updateBookedSeats(Long eventId, int bookedSeats) {
        SeatInventoryRecord record = getByEvent(eventId);
        record.setBookedSeats(bookedSeats);
        return repository.save(record);
    }
}
