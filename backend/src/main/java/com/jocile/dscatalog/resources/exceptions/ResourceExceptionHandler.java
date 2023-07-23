package com.jocile.dscatalog.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jocile.dscatalog.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException r, HttpServletRequest request) {
    StandardError error = new StandardError();
    error.setTimestamp(Instant.now());
    error.setStatus(HttpStatus.NOT_FOUND.value());
    error.setError("Resource not found");
    error.setMessage(r.getMessage());
    error.setPath(request.getRequestURI());
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
  }
}
