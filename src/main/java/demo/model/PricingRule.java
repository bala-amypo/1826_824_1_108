package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class PricingRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleCode;

    private int minRemainingSeats;
    private int maxRemainingSeats;

    private int daysBeforeEvent;

    private double priceMultiplier;

    private boolean active;

    // getters/setters
}
