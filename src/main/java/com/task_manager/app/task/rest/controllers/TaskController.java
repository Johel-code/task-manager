package com.task_manager.app.task.rest.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task_manager.app.task.rest.response.TaskResponse;
import com.task_manager.domain.task.service.TaskService;

import lombok.RequiredArgsConstructor;

/**
 * TaskController
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/tasks")
public class TaskController {

  private final TaskService taskService;

  @GetMapping("")
  public ResponseEntity<List<TaskResponse>> showAll() {
    return new ResponseEntity<>(taskService.showAll(), HttpStatus.OK);
  }

  @GetMapping("/{taskId}")
  public ResponseEntity<TaskResponse> show(@PathVariable Long taskId) {
    return new ResponseEntity<>(taskService.show(taskId), HttpStatus.OK);
  }

}
