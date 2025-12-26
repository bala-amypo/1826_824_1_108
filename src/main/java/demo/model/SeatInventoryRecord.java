package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "seat_inventory")
public class SeatInventoryRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long eventId;

    private Integer totalSeats;

    private Integer bookedSeats;

    public SeatInventoryRecord() {
    }

    public SeatInventoryRecord(Long eventId, Integer totalSeats, Integer bookedSeats) {
        this.eventId = eventId;
        this.totalSeats = totalSeats;
        this.bookedSeats = bookedSeats;
    }

    // getters + setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Integer getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(Integer bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
