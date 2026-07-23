package com.nap.task_management_system.repository;

import com.nap.task_management_system.model.Priority;
import com.nap.task_management_system.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nap.task_management_system.model.Task;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByPriority(Priority priority);
    List<Task> findByStatus(Status status);
    List<Task> findByPriorityAndStatus(Priority priority, Status status);
}