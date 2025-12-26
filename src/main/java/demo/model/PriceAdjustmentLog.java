package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class PriceAdjustmentLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long eventId;

    private double oldPrice;
    private double newPrice;

    private LocalDateTime changedAt = LocalDateTime.now();

    // getters/setters
}
