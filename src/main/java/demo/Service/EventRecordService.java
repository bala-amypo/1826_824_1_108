package com.example.demo.service;

import com.example.demo.entity.EventRecord;

import java.util.List;

public interface EventRecordService {

    EventRecord create(EventRecord event);

    EventRecord getById(Long id);

    List<EventRecord> getAll();

    EventRecord update(Long id, EventRecord event);

    void delete(Long id);
}
