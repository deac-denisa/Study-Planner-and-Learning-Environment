package com.project.studyPlannerAndLearningEnvironment.model;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Goal {
    private Long id;
    private LearningSession learningSession;
    private String description;
    private LocalTime goalTime;
    private String achieved;           //goal completed = yes


    public void setId(Long id) {
        this.id = id;
    }


    @ManyToOne(optional = false)
    public LearningSession getLearningSession() {
        return learningSession;
    }

    public void setLearningSession(LearningSession learningSession) {
        this.learningSession = learningSession;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalTime getGoalTime() {
        return goalTime;
    }

    public void setGoalTime(LocalTime goalTime) {
        this.goalTime = goalTime;
    }

    public String getAchieved() {
        return achieved;
    }

    public void setAchieved(String achieved) {
        this.achieved = achieved;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
