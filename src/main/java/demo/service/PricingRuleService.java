package com.example.demo.service;

import com.example.demo.entity.PricingRule;

import java.util.List;

public interface PricingRuleService {

    PricingRule create(PricingRule rule);

    List<PricingRule> getAll();
}
