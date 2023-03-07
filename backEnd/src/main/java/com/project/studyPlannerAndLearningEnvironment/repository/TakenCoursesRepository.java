package com.project.studyPlannerAndLearningEnvironment.repository;

import com.project.studyPlannerAndLearningEnvironment.model.Student;
import com.project.studyPlannerAndLearningEnvironment.model.TakenCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TakenCoursesRepository extends JpaRepository<TakenCourse, Long> {

}


