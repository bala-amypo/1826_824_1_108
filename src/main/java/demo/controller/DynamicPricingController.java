package com.example.demo.controller;

import com.example.demo.model.DynamicPriceRecord;
import com.example.demo.service.DynamicPricingEngineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dynamic-pricing")
public class DynamicPricingController {

    private final DynamicPricingEngineService pricingEngineService;

    public DynamicPricingController(DynamicPricingEngineService pricingEngineService) {
        this.pricingEngineService = pricingEngineService;
    }

    @PostMapping("/compute/{eventId}")
    public DynamicPriceRecord compute(@PathVariable Long eventId) {
        return pricingEngineService.computeDynamicPrice(eventId);
    }

    @GetMapping("/latest/{eventId}")
    public DynamicPriceRecord latest(@PathVariable Long eventId) {
        return pricingEngineService.getLatestPrice(eventId)
                .orElseThrow();
    }

    @GetMapping("/history/{eventId}")
    public List<DynamicPriceRecord> history(@PathVariable Long eventId) {
        return pricingEngineService.getPriceHistory(eventId);
    }

    @GetMapping
    public List<DynamicPriceRecord> all() {
        return pricingEngineService.getAllComputedPrices();
    }
}
