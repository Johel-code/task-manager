package com.task_manager.common.constants;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ErrorMsg
 */
@Getter
@AllArgsConstructor
public enum ErrorMsg {

  TASK_NOT_FOUND("001", "Task not found", HttpStatus.NOT_FOUND),
  INVALID_REQUEST("002", "Invalid request", HttpStatus.BAD_REQUEST),
  INTERNAL_ERROR("003", "Internal error", HttpStatus.INTERNAL_SERVER_ERROR),
  JSON_PROCESING("004", "Error al procesar json", HttpStatus.NOT_FOUND),
  FORBIDDEN("005", "Acceso denegado", HttpStatus.FORBIDDEN);

  private final String errorCode;
  private final String message;
  private final HttpStatus statusCode;

}
