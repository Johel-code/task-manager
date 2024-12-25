package com.task_manager.app.task.rest.response;

import java.time.LocalDate;

/**
 * TaskResponse
 */
public record TaskResponse(
    Long id,
    String name,
    String description,
    boolean complete,
    char priority,
    LocalDate dueDate) {

}
