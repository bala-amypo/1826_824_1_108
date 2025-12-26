package com.example.demo.service.impl;

import com.example.demo.entity.PricingRule;
import com.example.demo.repository.PricingRuleRepository;
import com.example.demo.service.PricingRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricingRuleServiceImpl implements PricingRuleService {

    @Autowired
    private PricingRuleRepository repository;

    @Override
    public PricingRule create(PricingRule rule) {
        return repository.save(rule);
    }

    @Override
    public List<PricingRule> getAll() {
        return repository.findAll();
    }
}
