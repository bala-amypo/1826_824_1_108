 package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class PricingRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruleCode;
    private Integer minRemainingSeats;
    private Integer maxRemainingSeats;
    private Integer daysBeforeEvent;
    private Double priceMultiplier;

    @Column(nullable = false)
    private Boolean active = true;   // ✅ REQUIRED FIELD

    // Getters and Setters
    public Long getId() { 
        return id; 
    }
    public void setId(Long id) { 
        this.id = id; 
    }

    public String getRuleCode() { 
        return ruleCode; 
    }
    public void setRuleCode(String ruleCode) { 
        this.ruleCode = ruleCode; 
    }

    public Integer getMinRemainingSeats() { 
        return minRemainingSeats; 
    }
    public void setMinRemainingSeats(Integer minRemainingSeats) { 
        this.minRemainingSeats = minRemainingSeats; 
    }

    public Integer getMaxRemainingSeats() { 
        return maxRemainingSeats; 
    }
    public void setMaxRemainingSeats(Integer maxRemainingSeats) { 
        this.maxRemainingSeats = maxRemainingSeats; 
    }

    public Integer getDaysBeforeEvent() { 
        return daysBeforeEvent; 
    }
    public void setDaysBeforeEvent(Integer daysBeforeEvent) { 
        this.daysBeforeEvent = daysBeforeEvent; 
    }

    public Double getPriceMultiplier() { 
        return priceMultiplier; 
    }
    public void setPriceMultiplier(Double priceMultiplier) { 
        this.priceMultiplier = priceMultiplier; 
    }

    public Boolean getActive() {        // ✅ Getter
        return active;
    }
    public void setActive(Boolean active) {   // ✅ Setter
        this.active = active;
    }
}
