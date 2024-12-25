package com.task_manager.common.exceptions;

import org.springframework.http.HttpStatus;

import com.task_manager.common.constants.ErrorMsg;

/**
 * TaskNotFoundException
 */
public class TaskNotFoundException extends BaseException {

  public TaskNotFoundException() {
    super(ErrorMsg.TASK_NOT_FOUND);
  }

}
