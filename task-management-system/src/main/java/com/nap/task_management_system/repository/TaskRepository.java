package com.nap.task_management_system.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Repository;

import com.nap.task_management_system.model.Priority;
import com.nap.task_management_system.model.Task;

@Repository
public class TaskRepository {
    private final List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
        Task task = new Task( 
            1L,
            "Learn Spring Boot",
            "Understand Dependency Injection",
            Priority.HIGH,
            LocalDateTime.now().plusDays(7)
        );

        tasks.add(task);
    }

    public Task save(Task task) {
        tasks.add(task);

        return task;
    }

    public List<Task> findAll() {
        return tasks;
    }

    public Task findById(Long id) {
        for (Task task : tasks) {
            if (Objects.equals(task.getId(), id)) {
                return task;
            }
        }

        return null;
    }

    public Task update(Long id, Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            Task existing = tasks.get(i);

            if (Objects.equals(id, existing.getId())) {
                existing.setTitle(task.getTitle());
                existing.setDescription(task.getDescription());
                existing.setPriority(task.getPriority());
                existing.setStatus(task.getStatus());
                existing.setDeadline(task.getDeadline());
                existing.setUpdateAt(LocalDateTime.now());

                return existing;
            }
        }
        
        return null;
    }

    public void deleteById(Long id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            if (Objects.equals(task.getId(), id)) {
                tasks.remove(task);
                return;
            }
        }
    }
}