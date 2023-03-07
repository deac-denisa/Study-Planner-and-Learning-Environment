package com.project.studyPlannerAndLearningEnvironment.controllers;

import com.project.studyPlannerAndLearningEnvironment.model.Student;
import com.project.studyPlannerAndLearningEnvironment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    Student newStudent(@RequestBody Student newStudent){
        return studentRepository.save(newStudent);
    }

    @GetMapping("/get")
    List<Student> getAllStudents(){
        return studentRepository.findAll();
    }


}
