package com.example.demo.service.impl;

import com.example.demo.entity.EventRecord;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.EventRecordRepository;
import com.example.demo.service.EventRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventRecordServiceImpl implements EventRecordService {

    @Autowired
    private EventRecordRepository repository;

    @Override
    public EventRecord create(EventRecord event) {
        return repository.save(event);
    }

    @Override
    public EventRecord getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Event not found"));
    }

    @Override
    public List<EventRecord> getAll() {
        return repository.findAll();
    }

    @Override
    public EventRecord update(Long id, EventRecord event) {
        EventRecord existing = getById(id);

        existing.setEventName(event.getEventName());
        existing.setVenue(event.getVenue());
        existing.setBasePrice(event.getBasePrice());
        existing.setEventDate(event.getEventDate());

        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
