package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "event_records")
public class EventRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String eventCode;

    private String eventName;
    private String venue;
    private LocalDate eventDate;

    @Column(nullable = false)
    private Double basePrice;

    private LocalDateTime createdAt;

    private Boolean active;

    @OneToMany(mappedBy = "eventId")
    private List<SeatInventoryRecord> inventories;

    @OneToMany(mappedBy = "eventId")
    private List<DynamicPriceRecord> dynamicPrices;

    @OneToMany(mappedBy = "eventId")
    private List<PriceAdjustmentLog> priceAdjustments;

    public EventRecord() {}

    // Getters and setters omitted for brevity

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
        if (active == null) active = true;
    }
}
