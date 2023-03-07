package com.project.studyPlannerAndLearningEnvironment.controllers;

import com.project.studyPlannerAndLearningEnvironment.model.Student;
import com.project.studyPlannerAndLearningEnvironment.repository.LecturesRepository;
import com.project.studyPlannerAndLearningEnvironment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lectures")
@CrossOrigin
public class LectureController {

    @Autowired
    LecturesRepository lecturesRepository;
    @Autowired
    StudentRepository studentRepository;
    String lecture;
    String week_nr;
    String description;

    @PostMapping("/set-lecture")
    void addNewLecture( String s){
       lecture = s.substring(1, s.length()-1);
        System.out.println(lecture);
    }


    @PostMapping("/set-week-nr")
    void setNewLecture( String w){
        week_nr = w.substring(1, w.length()-1);
        System.out.println(week_nr);
    }

    @PostMapping("/set-description")
    void setLectureDescr( String d){
        description = d.substring(1, d.length()-1);
        System.out.println(description);
        Student s = studentRepository.getReferenceById(1L);
    }
}
