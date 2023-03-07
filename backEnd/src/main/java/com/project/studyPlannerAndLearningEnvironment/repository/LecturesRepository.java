package com.project.studyPlannerAndLearningEnvironment.repository;

import com.project.studyPlannerAndLearningEnvironment.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturesRepository extends JpaRepository<Lecture,Long> {
}
