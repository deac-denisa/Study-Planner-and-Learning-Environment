package com.project.studyPlannerAndLearningEnvironment.controllers;

import com.project.studyPlannerAndLearningEnvironment.model.Goal;
import com.project.studyPlannerAndLearningEnvironment.repository.GoalsRepository;
import com.project.studyPlannerAndLearningEnvironment.repository.LearningSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/goal")
@CrossOrigin
public class GoalController {

    @Autowired
    private GoalsRepository goalsRepository;
    @Autowired
    private LearningSessionRepository learningSessions;
    LocalTime goalTime;

    @PostMapping("/add")
    Goal newStudent(@RequestBody Goal newGoal){
        return goalsRepository.save(newGoal);
    }



    @PostMapping("/add-goal")
    void newGoal(@RequestBody String description){
        Goal goal = new Goal();
        goal.setAchieved("no");
        goal.setDescription(description);
        goal.setGoalTime(goalTime);
        goal.setLearningSession(learningSessions.getReferenceById(1L));
        goalsRepository.save(goal);
    }

    @PostMapping("/set-time")
    void setTime(@RequestBody String time){
        String time1 = time.substring(1, time.length()-1);
        System.out.println(time1);
        goalTime = LocalTime.parse(time1);
    }


    @GetMapping("/get")
    List<Goal> getAllStudents(){
        return goalsRepository.findAll();
    }

}
