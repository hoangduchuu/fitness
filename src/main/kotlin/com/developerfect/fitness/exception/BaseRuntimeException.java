package com.developerfect.fitness.exception

public class BaseRuntimeException extends RuntimeException {
    private int errorCode;

    public BaseRuntimeException(String message) {
        super(message);
    }

    public BaseRuntimeException(int code) {
        this.errorCode = code;
    }

    public BaseRuntimeException(String message, int code) {
        super(message);
        this.errorCode = code;
    }

    public BaseRuntimeException(Throwable cause, int code) {
        super(cause);
        this.errorCode = code;
    }

    public BaseRuntimeException(String message, int code, Throwable cause) {
        super(message, cause);
        this.errorCode = code;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
