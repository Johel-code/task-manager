package com.task_manager.domain.task.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.task_manager.app.task.rest.request.TaskRequest;
import com.task_manager.app.task.rest.response.TaskResponse;

/**
 * TaskService
 */
public interface TaskService {

  TaskResponse create(TaskRequest request);

  TaskResponse update(Long id, TaskRequest request);

  TaskResponse show(Long id);

  List<TaskResponse> showAll();

  TaskResponse delete(Long id);
}
