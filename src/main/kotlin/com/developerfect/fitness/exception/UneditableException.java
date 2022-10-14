package com.developerfect.fitness.exception

public class UneditableException extends VBBaseRuntimeException {
    public UneditableException(int code) {
        super(code);
    }

    public UneditableException(String message, int code) {
        super(message, code);
    }

    public UneditableException(Throwable cause, int code) {
        super(cause, code);
    }

    public UneditableException(String message, int code, Throwable cause) {
        super(message, code, cause);
    }

    public static UneditableException of(ErrorCode.ErrorEnum errorEnum) {
        return new UneditableException(errorEnum.name(), errorEnum.getValue());
    }
}
