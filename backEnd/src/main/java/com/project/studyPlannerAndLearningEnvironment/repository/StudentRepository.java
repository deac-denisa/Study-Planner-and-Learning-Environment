package com.project.studyPlannerAndLearningEnvironment.repository;

import com.project.studyPlannerAndLearningEnvironment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
