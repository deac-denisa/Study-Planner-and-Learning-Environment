package com.project.studyPlannerAndLearningEnvironment.repository;

import com.project.studyPlannerAndLearningEnvironment.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalsRepository extends JpaRepository<Goal, Long> {
}
