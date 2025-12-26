package com.example.demo.service;

import com.example.demo.entity.SeatInventoryRecord;

public interface SeatInventoryService {

    SeatInventoryRecord create(SeatInventoryRecord record);

    SeatInventoryRecord getByEvent(Long eventId);

    SeatInventoryRecord updateBookedSeats(Long eventId, int bookedSeats);
}
