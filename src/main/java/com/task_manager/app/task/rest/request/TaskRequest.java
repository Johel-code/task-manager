package com.task_manager.app.task.rest.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

/**
 * TaskRequest
 */
public record TaskRequest(
    @NotBlank String name,

    String description,
    char priority,
    LocalDate dueDate) {
}
