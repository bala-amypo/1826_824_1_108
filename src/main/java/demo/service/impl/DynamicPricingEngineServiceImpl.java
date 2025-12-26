package com.example.demo.service.impl;

import com.example.demo.entity.EventRecord;
import com.example.demo.entity.PricingRule;
import com.example.demo.entity.SeatInventoryRecord;
import com.example.demo.repository.PricingRuleRepository;
import com.example.demo.service.DynamicPricingEngineService;
import com.example.demo.service.EventRecordService;
import com.example.demo.service.SeatInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamicPricingEngineServiceImpl implements DynamicPricingEngineService {

    @Autowired
    private EventRecordService eventService;

    @Autowired
    private SeatInventoryService seatService;

    @Autowired
    private PricingRuleRepository pricingRuleRepository;

    @Override
    public double calculatePrice(Long eventId) {

        EventRecord event = eventService.getById(eventId);
        SeatInventoryRecord inventory = seatService.getByEvent(eventId);

        double base = event.getBasePrice();

        double demand = (double) inventory.getBookedSeats() / inventory.getTotalSeats();

        List<PricingRule> rules = pricingRuleRepository.findAll();

        double price = base;

        for (PricingRule rule : rules) {
            if (demand >= rule.getDemandThreshold()) {
                price += base * (rule.getPriceIncreasePercentage() / 100);
            } else {
                price -= base * (rule.getPriceDecreasePercentage() / 100);
            }
        }

        return Math.max(price, 0);
    }
}
