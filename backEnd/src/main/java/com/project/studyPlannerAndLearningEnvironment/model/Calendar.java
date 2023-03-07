package com.project.studyPlannerAndLearningEnvironment.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Calendar {
    private Long id;
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String eventType;
    private String description;

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(LocalDate eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public LocalDate getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(LocalDate eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
