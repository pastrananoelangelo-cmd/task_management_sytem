package com.nap.task_management_system.controller;

import java.util.List;

import com.nap.task_management_system.model.Priority;
import com.nap.task_management_system.model.Status;
import org.springframework.web.bind.annotation.*;

import com.nap.task_management_system.model.Task;
import com.nap.task_management_system.service.TaskService;

import jakarta.validation.Valid;

@RestController
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/tasks")
    public Task saveTask(@Valid @RequestBody Task task) {
        return taskService.save(task);
    }

    @GetMapping("/tasks")
    public List<Task> getTasks(@RequestParam(required = false) Priority priority,
                               @RequestParam(required = false) Status status) {
        return taskService.findBy(priority, status);
    }

    @GetMapping("/tasks/{id}")
    public Task findTask(@PathVariable Long id) {
        return taskService.findById(id);
    }

    @PutMapping("/tasks/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.update(id, task);
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteById(id);
    }

}
