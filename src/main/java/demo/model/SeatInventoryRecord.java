package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SeatInventoryRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long eventId;
    private Integer totalSeats;
    private Integer remainingSeats; // <-- Add this field

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getEventId() { return eventId; }
    public void setEventId(Long eventId) { this.eventId = eventId; }

    public Integer getTotalSeats() { return totalSeats; }
    public void setTotalSeats(Integer totalSeats) { this.totalSeats = totalSeats; }

    public Integer getRemainingSeats() { return remainingSeats; } // <-- Add getter
    public void setRemainingSeats(Integer remainingSeats) { this.remainingSeats = remainingSeats; } // <-- Add setter
}
