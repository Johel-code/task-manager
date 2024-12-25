package com.task_manager.common.dto;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * ErrorResponse
 */
public record CustomErrorResponse(
    String codigo,
    String mensaje,
    @JsonIgnore HttpStatus status) {
}
