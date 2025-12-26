package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class SeatInventoryRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long eventId;

    private int totalSeats;

    private int remainingSeats;

    // getters/setters
}
