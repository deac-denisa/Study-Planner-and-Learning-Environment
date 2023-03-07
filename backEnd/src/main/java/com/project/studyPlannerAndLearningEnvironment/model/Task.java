package com.project.studyPlannerAndLearningEnvironment.model;

import jakarta.persistence.*;

@Entity
public class Task {

    private Long id;
    private Student student;
    private String description;
    private String achieved;

    @ManyToOne(optional = true)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAchieved() {
        return achieved;
    }

    public void setAchieved(String achieved) {
        this.achieved = achieved;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
