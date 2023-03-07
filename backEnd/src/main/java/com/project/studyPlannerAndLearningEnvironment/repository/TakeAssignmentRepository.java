package com.project.studyPlannerAndLearningEnvironment.repository;

import com.project.studyPlannerAndLearningEnvironment.model.TakenAssignment;
import com.project.studyPlannerAndLearningEnvironment.model.TakenCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TakeAssignmentRepository extends JpaRepository<TakenAssignment,Long> {
}
