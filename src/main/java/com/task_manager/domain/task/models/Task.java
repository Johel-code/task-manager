package com.task_manager.domain.task.models;

import java.time.LocalDateTime;

import com.task_manager.app.task.rest.response.TaskResponse;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * Task
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_task")
public class Task extends BaseModel {

  private String name;
  private String description;
  private boolean complete;
  private char priority;

  @Column(name = "due_date")
  private LocalDateTime dueDate;

  public static TaskResponse aResponse(Task a) {
    return new TaskResponse(a.getId(), a.getName(), a.getDescription(), a.isComplete(), a.getPriority(),
        a.getDueDate());
  }

}
