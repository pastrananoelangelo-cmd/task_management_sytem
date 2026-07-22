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
        return repository.findById(id).orElse(null);
    }

    public Task update(Long id, Task updatedTask) {
        Task task = repository.findById(id).orElseThrow();

        task.setTitle(updatedTask.getTitle());
        task.setDescription(updatedTask.getDescription());
        task.setPriority(updatedTask.getPriority());
        task.setDeadline(updatedTask.getDeadline());
        task.setStatus(updatedTask.getStatus());

        return repository.save(task);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
