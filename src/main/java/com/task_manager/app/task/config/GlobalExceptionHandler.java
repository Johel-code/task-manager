package com.task_manager.app.task.config;

import java.util.stream.Collectors;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.task_manager.common.dto.CustomErrorResponse;
import com.task_manager.common.exceptions.BaseException;

/**
 * RestExceptionHandler
 */
@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(BaseException.class)
  protected ResponseEntity<Object> handleBaseException(BaseException ex) {
    return buildResponseEntity(
        new CustomErrorResponse(ex.getErrorCode(), ex.getMessage(), ex.getStatusCode()));
  }

  @ExceptionHandler(HttpMessageNotReadableException.class) // error en el post
  protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex) {
    return buildResponseEntity(
        new CustomErrorResponse("01", ex.getMessage(), HttpStatus.BAD_REQUEST));
  }

  // @ExceptionHandler(MethodArgumentNotValidException.class) // Algun argumento
  // falta
  // protected ResponseEntity<Object>
  // handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
  // List<String> errors = ex.getBindingResult().getFieldError().stream()
  // .map(error -> error.getField() + ": " + error.getDefaultMessage())
  // .collect(Collectors.toList());
  // return buildResponseEntity(
  // new CustomErrorResponse("02", ex.getMessage(), HttpStatus.BAD_REQUEST));
  // }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
    List<String> errors = ex.getBindingResult().getFieldErrors().stream()
        .map(error -> error.getField() + ": " + error.getDefaultMessage())
        .collect(Collectors.toList());

    return buildResponseEntity(
        new CustomErrorResponse("02", "Validation failed", HttpStatus.BAD_REQUEST));
  }

  @ExceptionHandler(MissingRequestHeaderException.class) // Cabecera es requerido
  protected ResponseEntity<Object> handleMissingRequestHeaderException(MissingRequestHeaderException ex) {
    return buildResponseEntity(
        new CustomErrorResponse("03", ex.getMessage(), HttpStatus.BAD_REQUEST));
  }

  /*
   * @ExceptionHandler(ProviderException.class)
   * protected ResponseEntity<Object>
   * handleMethodProviderException(ProviderException ex) {
   * logPrinter.write(ex);
   * return buildResponseEntity(new ApiError(ex.getMensaje(),ex.getMensajeTec(),
   * ex.getCodigo(), ex.getStatus()));
   * }
   */

  // @ExceptionHandler(AccessDeniedException.class)
  // protected ResponseEntity<Object>
  // handleMethodAccessDeniedException(AccessDeniedException ex) {
  // return buildResponseEntity(
  // new ApiError(ErrorMsg.FORBIDDEN.getCod(), ErrorMsg.FORBIDDEN.getMsj(),
  // HttpStatus.FORBIDDEN));
  // }

  @ExceptionHandler(Exception.class) // Exception generico
  protected ResponseEntity<Object> handleMethodBadException(Exception ex) {
    return buildResponseEntity(
        new CustomErrorResponse("99", "Error interno del servidor", HttpStatus.INTERNAL_SERVER_ERROR));
  }

  private ResponseEntity<Object> buildResponseEntity(CustomErrorResponse error) {
    return new ResponseEntity<>(error, error.status());
  }
}
