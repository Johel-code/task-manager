package com.task_manager.domain.task.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task_manager.domain.task.models.Task;

/**
 * TaskRespository
 */
public interface TaskRespository extends JpaRepository<Task, Long> {

}
