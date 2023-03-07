package com.project.studyPlannerAndLearningEnvironment.model;

import jakarta.persistence.*;

@Entity
public class TakenAssignment {

    private Long id;
    private Assignment assignment;
    private Student student;
    private String solution;
    private Float grade;
    private String feedback;

    @ManyToOne(optional = false)
    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    @ManyToOne(optional = false)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
}
