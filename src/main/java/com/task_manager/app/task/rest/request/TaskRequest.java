package com.task_manager.app.task.rest.request;

import jakarta.validation.constraints.NotBlank;

/**
 * TaskRequest
 */
public record TaskRequest(
    @NotBlank String name,

    String description,
    boolean complete,
    char priority,
    String dueDAte) {
}
