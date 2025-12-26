package com.example.demo.service;

import com.example.demo.entity.PriceAdjustmentLog;

import java.util.List;

public interface PriceAdjustmentLogService {

    PriceAdjustmentLog save(PriceAdjustmentLog log);

    List<PriceAdjustmentLog> getByEvent(Long eventId);
}
