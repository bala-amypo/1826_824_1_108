package com.example.demo.repository;

import com.example.demo.model.PricingRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PricingRuleRepository extends JpaRepository<PricingRule, Long> {

    // Check if a PricingRule exists with the given ruleCode
    boolean existsByRuleCode(String ruleCode);

    // Find a PricingRule by ruleCode
    Optional<PricingRule> findByRuleCode(String ruleCode);

    // Find all PricingRules where active = true
    List<PricingRule> findByActiveTrue();
}
