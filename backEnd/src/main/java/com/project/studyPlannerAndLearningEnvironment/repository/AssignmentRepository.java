package com.project.studyPlannerAndLearningEnvironment.repository;

import com.project.studyPlannerAndLearningEnvironment.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
