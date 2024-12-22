package com.task_manager.app.task.rest.response;

import java.time.LocalDateTime;

/**
 * TaskResponse
 */
public record TaskResponse(
    Long id,
    String name,
    String description,
    boolean complete,
    char priority,
    LocalDateTime dueDate) {

}
