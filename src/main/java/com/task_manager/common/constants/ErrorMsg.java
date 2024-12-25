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
  INVALID_REQUEST("001", "Task not found", HttpStatus.NOT_FOUND),
  INTERNAL_ERROR("001", "Task not found", HttpStatus.NOT_FOUND),
  JSON_PROCESING("001", "Task not found", HttpStatus.NOT_FOUND),
  FORBIDDEN("001", "Task not found", HttpStatus.NOT_FOUND);

  private final String errorCode;
  private final String message;
  private final HttpStatus statusCode;

}
