package com.edntisolutions.testdocker.controller;

import com.edntisolutions.testdocker.domain.Task;
import com.edntisolutions.testdocker.repository.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("${app.allowed-origin}")
public record AppController(TaskRepository taskRepository) {

    @GetMapping("health")
    public String healthCheck() {
        return "application is working";
    }

    @GetMapping("tasks")
    @ResponseStatus(HttpStatus.OK)
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

}
