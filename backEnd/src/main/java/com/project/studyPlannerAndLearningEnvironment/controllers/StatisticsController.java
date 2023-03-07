package com.project.studyPlannerAndLearningEnvironment.controllers;


import com.project.studyPlannerAndLearningEnvironment.model.TakenAssignment;
import com.project.studyPlannerAndLearningEnvironment.repository.TakeAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statistics")
@CrossOrigin
public class StatisticsController {

    @Autowired
    private TakeAssignmentRepository takenAssignments;
    String course;


    @GetMapping("/get-average")
    String getAverageGrade() {
        float average = 0;
        int size =0;

       List<TakenAssignment> ta = takenAssignments.findAll();
        for(TakenAssignment t: ta){
            if( (t.getAssignment().getCourse().getName()).equals(course) ) {
                average += t.getGrade();
                size++;
            }
        }

        average = average/ size;
        System.out.println(average);
       return String.valueOf(average);
    }

    @PostMapping("/set-course-s")
    void setChosenCourse(@RequestBody String course1){
        course = course1.substring(1, course1.length()-1);
        System.out.println(course);
    }

}
