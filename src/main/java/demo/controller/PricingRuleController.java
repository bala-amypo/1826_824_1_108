package com.example.demo.controller;

import com.example.demo.model.PricingRule;
import com.example.demo.service.PricingRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pricing-rules")
public class PricingRuleController {

    private final PricingRuleService pricingRuleService;

    public PricingRuleController(PricingRuleService pricingRuleService) {
        this.pricingRuleService = pricingRuleService;
    }

    @PostMapping
    public PricingRule create(@RequestBody PricingRule rule) {
        return pricingRuleService.createRule(rule);
    }

    @PutMapping("/{id}")
    public PricingRule update(@PathVariable Long id,
                              @RequestBody PricingRule rule) {
        return pricingRuleService.updateRule(id, rule);
    }

    @GetMapping("/active")
    public List<PricingRule> getActive() {
        return pricingRuleService.getActiveRules();
    }

    @GetMapping("/{id}")
    public PricingRule getById(@PathVariable Long id) {
        return pricingRuleService.getAllRules()
                .stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    @GetMapping
    public List<PricingRule> getAll() {
        return pricingRuleService.getAllRules();
    }
}
