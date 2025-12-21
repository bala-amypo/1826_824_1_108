package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class PricingRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleCode;
    private Double priceMultiplier;
    private Integer minRemainingSeats; // <-- Add this field
    private Integer maxRemainingSeats; // <-- If needed
    private Integer daysBeforeEvent;   // <-- If used in service

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRuleCode() { return ruleCode; }
    public void setRuleCode(String ruleCode) { this.ruleCode = ruleCode; }

    public Double getPriceMultiplier() { return priceMultiplier; }
    public void setPriceMultiplier(Double priceMultiplier) { this.priceMultiplier = priceMultiplier; }

    public Integer getMinRemainingSeats() { return minRemainingSeats; } // <-- Add getter
    public void setMinRemainingSeats(Integer minRemainingSeats) { this.minRemainingSeats = minRemainingSeats; } // <-- Add setter

    public Integer getMaxRemainingSeats() { return maxRemainingSeats; } // If needed
    public void setMaxRemainingSeats(Integer maxRemainingSeats) { this.maxRemainingSeats = maxRemainingSeats; }

    public Integer getDaysBeforeEvent() { return daysBeforeEvent; } // If needed
    public void setDaysBeforeEvent(Integer daysBeforeEvent) { this.daysBeforeEvent = daysBeforeEvent; }
}
