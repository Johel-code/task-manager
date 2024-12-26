package com.task_manager.app.task.rest.request;

import java.time.LocalDate;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;

/**
 * TaskRequest
 */
public record TaskRequest(
    @NotBlank(message = "El nombre no debe estar en blanco") String name,

    String description,

    char priority,
    boolean complete,

    @FutureOrPresent LocalDate dueDate) {
}
