package com.PWS.AdminService.exception;

public class PWSException extends Exception {

    private static final long serialVersionUID = 1L;

    private final String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public PWSException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}