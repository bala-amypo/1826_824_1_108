package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pricing_rules")
public class PricingRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleName;
    private String conditionType;
    private Double adjustmentValue; // e.g., +10% or -5%

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRuleName() { return ruleName; }
    public void setRuleName(String ruleName) { this.ruleName = ruleName; }

    public String getConditionType() { return conditionType; }
    public void setConditionType(String conditionType) { this.conditionType = conditionType; }

    public Double getAdjustmentValue() { return adjustmentValue; }
    public void setAdjustmentValue(Double adjustmentValue) { this.adjustmentValue = adjustmentValue; }
}
