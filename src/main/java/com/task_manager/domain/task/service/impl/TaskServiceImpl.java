package com.task_manager.domain.task.service.impl;

import java.util.List;

import com.task_manager.app.task.rest.request.TaskRequest;
import com.task_manager.app.task.rest.response.TaskResponse;
import com.task_manager.domain.task.models.Task;
import com.task_manager.domain.task.respository.TaskRespository;
import com.task_manager.domain.task.service.TaskService;

import lombok.RequiredArgsConstructor;

/**
 * TaskServiceImpl
 */
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

  private final TaskRespository taskRespository;

  @Override
  public TaskResponse create(TaskRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public TaskResponse update(Long id, TaskRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public TaskResponse show(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<TaskResponse> showAll() {
    List<TaskResponse> list = taskRespository.findAll().stream().map(Task::aResponse).toList();
    return list;
  }

  @Override
  public TaskResponse delete(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

}
