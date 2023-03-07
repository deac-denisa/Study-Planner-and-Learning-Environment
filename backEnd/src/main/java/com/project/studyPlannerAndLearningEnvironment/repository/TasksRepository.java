package com.project.studyPlannerAndLearningEnvironment.repository;

import com.project.studyPlannerAndLearningEnvironment.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Task, Long> {
}
