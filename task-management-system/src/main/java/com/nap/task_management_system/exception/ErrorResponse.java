package com.nap.task_management_system.exception;

import java.util.List;

public class ErrorResponse {
    private final List<ValidationError> errors;

    // constructor
   public ErrorResponse(List<ValidationError> errors) {
       this.errors = errors;
   }

    // getters
    public List<ValidationError> getErrors() {
       return this.errors;
    }
}
