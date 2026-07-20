package com.nap.task_management_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nap.task_management_system.model.Task;
import com.nap.task_management_system.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }
    
    public Task save(Task task) {
        return repository.save(task);
    }

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Task findById(Long id) {
        return repository.findById(id);
    }

    public Task update(Long id, Task task) {
        return repository.update(id, task);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
