package com.project.studyPlannerAndLearningEnvironment.repository;

import com.project.studyPlannerAndLearningEnvironment.model.LearningSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearningSessionRepository extends JpaRepository<LearningSession, Long> {
}
