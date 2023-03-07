package com.project.studyPlannerAndLearningEnvironment.model;

import jakarta.persistence.*;

@Entity
public class Assignment {

    private Long id;
    private Course course;
    private String text;

    

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(optional = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
