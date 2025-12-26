package com.example.demo.service.impl;

import com.example.demo.entity.PriceAdjustmentLog;
import com.example.demo.repository.PriceAdjustmentLogRepository;
import com.example.demo.service.PriceAdjustmentLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceAdjustmentLogServiceImpl implements PriceAdjustmentLogService {

    @Autowired
    private PriceAdjustmentLogRepository repository;

    @Override
    public PriceAdjustmentLog save(PriceAdjustmentLog log) {
        return repository.save(log);
    }

    @Override
    public List<PriceAdjustmentLog> getByEvent(Long eventId) {
        return repository.findByEventId(eventId);
    }
}
