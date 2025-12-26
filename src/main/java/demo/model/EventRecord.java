package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class EventRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private boolean active;

    private double basePrice;

    private LocalDate eventDate;

    // getters/setters
}
