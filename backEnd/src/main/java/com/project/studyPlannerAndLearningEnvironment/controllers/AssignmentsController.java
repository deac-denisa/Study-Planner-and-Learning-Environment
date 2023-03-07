package com.project.studyPlannerAndLearningEnvironment.controllers;


import com.project.studyPlannerAndLearningEnvironment.model.Assignment;
import com.project.studyPlannerAndLearningEnvironment.model.TakenAssignment;
import com.project.studyPlannerAndLearningEnvironment.repository.AssignmentRepository;
import com.project.studyPlannerAndLearningEnvironment.repository.StudentRepository;
import com.project.studyPlannerAndLearningEnvironment.repository.TakeAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignments")
@CrossOrigin
public class AssignmentsController {

    @Autowired
    private AssignmentRepository assignmentRepository;
    @Autowired
    private TakeAssignmentRepository takenAssignments;
    @Autowired
    private StudentRepository st;
    private String course;
    private String solution;
    private  Assignment currAssignment;

    @PostMapping("/set-course")
    void setTeacherC(@RequestBody String course1){
        course = course1.substring(1, course1.length()-1);
        System.out.println(course);
    }

    @GetMapping("/get-content")
    String getAssignmentContent(){

        List<Assignment> assignments = assignmentRepository.findAll();
        for( Assignment a: assignments){
            if( (a.getCourse().getName()).equals(course)){
                System.out.println(a.getText());
                currAssignment= a;
                return a.getText();
            }
        }
        return "no assignment";
    }

    @PostMapping("/set-solution")
    void setGivenSolution(@RequestBody String s){
        solution= s.substring(1, s.length()-1);
        System.out.println(solution);
        TakenAssignment ta = new TakenAssignment();
        ta.setSolution(solution);
        ta.setAssignment(currAssignment);
        ta.setStudent(st.getReferenceById(1L));
        takenAssignments.save(ta);

    }

}
