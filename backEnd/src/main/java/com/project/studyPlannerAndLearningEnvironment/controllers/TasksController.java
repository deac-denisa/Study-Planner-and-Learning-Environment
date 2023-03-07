package com.project.studyPlannerAndLearningEnvironment.controllers;


import com.project.studyPlannerAndLearningEnvironment.model.Lecture;
import com.project.studyPlannerAndLearningEnvironment.model.Student;
import com.project.studyPlannerAndLearningEnvironment.model.Task;
import com.project.studyPlannerAndLearningEnvironment.repository.LecturesRepository;
import com.project.studyPlannerAndLearningEnvironment.repository.StudentRepository;
import com.project.studyPlannerAndLearningEnvironment.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
//@CrossOrigin("http://localhost:3000")
public class TasksController {

    @Autowired
    private TasksRepository tasksRepository;
    @Autowired
    private StudentRepository students;


    @PostMapping("/add")
    void newTask(@RequestBody String description){
        Student s = students.getReferenceById(2L);
        Task task = new Task();
        task.setAchieved("no");
        task.setDescription(description.substring(1, description.length()-1));
        task.setStudent(s);
        tasksRepository.save(task);

    }

    @DeleteMapping("/delete")
    void deleteTask(@RequestBody String name){
        String title = name.substring(1, name.length()-1);
        List<Task> tasks = tasksRepository.findAll();
        for( Task t: tasks){
            if( (t.getDescription()).equals(title) ){
                tasksRepository.delete(t);
            }
        }
    }

    @GetMapping("/get")
    List<Task> getAllStudents(){
       return tasksRepository.findAll();
    }

}
