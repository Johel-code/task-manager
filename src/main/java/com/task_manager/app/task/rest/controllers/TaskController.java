package com.task_manager.app.task.rest.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task_manager.app.task.rest.request.TaskRequest;
import com.task_manager.app.task.rest.response.TaskResponse;
import com.task_manager.domain.task.service.TaskService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;

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
    return ResponseEntity.status(HttpStatus.OK).body(taskService.show(taskId));
  }

  @PostMapping
  public ResponseEntity<TaskResponse> create(@RequestBody TaskRequest task) {

    return ResponseEntity.status(HttpStatus.CREATED).body(taskService.create(task));
  }

  @PutMapping("/{id}")
  public ResponseEntity<TaskResponse> update(@PathVariable Long id, @RequestBody TaskRequest task) {
    return ResponseEntity.status(HttpStatus.OK).body(taskService.update(id, task));
  }

}
