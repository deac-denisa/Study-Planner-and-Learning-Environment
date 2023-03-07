package com.project.studyPlannerAndLearningEnvironment.controllers;

import com.project.studyPlannerAndLearningEnvironment.model.Calendar;
import com.project.studyPlannerAndLearningEnvironment.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calendar")
@CrossOrigin
public class CalendarController {
    @Autowired
    private CalendarRepository calendarRepository;

    @GetMapping("/get")
    List<Calendar> getAllEvents() { return calendarRepository.findAll();}
}
