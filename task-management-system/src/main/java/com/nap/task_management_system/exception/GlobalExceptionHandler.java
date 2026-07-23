package com.nap.task_management_system.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidation(MethodArgumentNotValidException ex) {
        List<ValidationError> errors = new ArrayList<>();

        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            // Create ValidationError
            ValidationError validationError = new ValidationError(error.getField(), error.getDefaultMessage());

            // Add it to the list
            errors.add(validationError);
        }

        ErrorResponse response = new ErrorResponse(errors);
        return ResponseEntity.badRequest().body(response);
    }
}
