package com.project.studyPlannerAndLearningEnvironment.model;

import jakarta.persistence.*;

@Entity
public class LearningSession {
    private Long id;
    private Lecture lecture;
    private Student student;
    private String notes;


    @ManyToOne(optional = false)
    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    @ManyToOne(optional = false)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
