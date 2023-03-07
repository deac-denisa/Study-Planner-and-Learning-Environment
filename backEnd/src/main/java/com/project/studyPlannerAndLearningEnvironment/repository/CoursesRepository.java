package com.project.studyPlannerAndLearningEnvironment.repository;

import com.project.studyPlannerAndLearningEnvironment.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface CoursesRepository extends JpaRepository<Course, Long> {
}
