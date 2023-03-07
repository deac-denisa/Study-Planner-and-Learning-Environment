package com.project.studyPlannerAndLearningEnvironment.model;

import jakarta.persistence.*;

@Entity
public class Lecture {

    private Long id;
    private String name;
    private Integer weekNr;
    private Course course;
    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeekNr() {
        return weekNr;
    }

    public void setWeekNr(Integer weekNr) {
        this.weekNr = weekNr;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @ManyToOne(optional = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
