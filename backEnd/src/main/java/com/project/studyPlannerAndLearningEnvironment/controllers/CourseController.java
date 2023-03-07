package com.project.studyPlannerAndLearningEnvironment.controllers;

import com.project.studyPlannerAndLearningEnvironment.model.*;
import com.project.studyPlannerAndLearningEnvironment.repository.CoursesRepository;
import com.project.studyPlannerAndLearningEnvironment.repository.LecturesRepository;
import com.project.studyPlannerAndLearningEnvironment.repository.StudentRepository;
import com.project.studyPlannerAndLearningEnvironment.repository.TakenCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CoursesRepository coursesRepository;
    @Autowired
    private LecturesRepository lecturesRepository;
    @Autowired
    private TakenCoursesRepository takenCoursesRepository;
    @Autowired
    private StudentRepository studentRepository;
    String contentL;
    String teacher;
    String course;
    String courseL;


    @GetMapping("/get")
    List<Course> getAllCourses(){ return coursesRepository.findAll();}


    @GetMapping("/get-lectures2")
    List<Lecture> getAllLectures( Course course){
        List<Lecture>  lect = lecturesRepository.findAll();
        List<Lecture> filteredLectures = new ArrayList<>();

        for(Lecture l : lect){
            if( (l.getCourse()).equals(course)){
                filteredLectures.add(l);
            }
        }
        return filteredLectures;
    }

    @GetMapping("/get-lectures")
    List<Lecture> getAllLectures(){
        List<Lecture>  lect = lecturesRepository.findAll();
     return  lect;
    }

    @PostMapping("/lecture-info")
    void setLectureContent(Lecture l){
        contentL = l.getText();
    }

    @GetMapping("/get-lecture-content")
    String getLectureContent(){
        return contentL;
    }

//take courses functions
    @PostMapping("/take-course")
    void newTakenC(@RequestBody String courseN){
       course = courseN.substring(1, courseN.length()-1);
       List<Course> tCourses = coursesRepository.findAll();
       for( Course c : tCourses){
           if( (c.getName()).equals(course) && (c.getTeacher().getName()).equals(teacher)){
               TakenCourse tc = new TakenCourse();
               tc.setCourse(c);
               tc.setStudent(studentRepository.getReferenceById(1L));

               takenCoursesRepository.save(tc);
           }
       }
    }

    @PostMapping("/set-teacher")
    void setTeacherC(@RequestBody String teacher1){
        teacher = teacher1.substring(1, teacher1.length()-1);
    }


  //view lecture

    @PostMapping("/set-course-l")
    void setTakenCourse(@RequestBody String course) {
        //teacher = teacher1.substring(1, teacher1.length() - 1);
        courseL = course;
        System.out.println(courseL);
    }

}
