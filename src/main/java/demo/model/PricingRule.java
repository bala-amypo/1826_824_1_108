package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pricing_rules")
public class PricingRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleName;

    private Double demandThreshold;

    private Double priceIncreasePercentage;

    private Double priceDecreasePercentage;

    public PricingRule() {
    }

    public PricingRule(String ruleName, Double demandThreshold,
                       Double priceIncreasePercentage, Double priceDecreasePercentage) {
        this.ruleName = ruleName;
        this.demandThreshold = demandThreshold;
        this.priceIncreasePercentage = priceIncreasePercentage;
        this.priceDecreasePercentage = priceDecreasePercentage;
    }

    // getters + setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public Double getDemandThreshold() {
        return demandThreshold;
    }

    public void setDemandThreshold(Double demandThreshold) {
        this.demandThreshold = demandThreshold;
    }

    public Double getPriceIncreasePercentage() {
        return priceIncreasePercentage;
    }

    public void setPriceIncreasePercentage(Double priceIncreasePercentage) {
        this.priceIncreasePercentage = priceIncreasePercentage;
    }

    public Double getPriceDecreasePercentage() {
        return priceDecreasePercentage;
    }

    public void setPriceDecreasePercentage(Double priceDecreasePercentage) {
        this.priceDecreasePercentage = priceDecreasePercentage;
    }
}
