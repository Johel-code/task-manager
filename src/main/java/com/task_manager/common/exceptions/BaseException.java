package com.task_manager.common.exceptions;

import org.springframework.http.HttpStatus;

import com.task_manager.common.constants.ErrorMsg;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * BaseException
 */
@Getter
@AllArgsConstructor
public class BaseException extends RuntimeException {

  private final String errorCode;
  private final HttpStatus statusCode;

  public BaseException(ErrorMsg error) {
    super(error.getMessage());
    errorCode = error.getErrorCode();
    statusCode = error.getStatusCode();
  }

}
