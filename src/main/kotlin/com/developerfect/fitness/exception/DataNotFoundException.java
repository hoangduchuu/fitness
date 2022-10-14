package com.developerfect.fitness.exception

public class DataNotFoundException extends BaseRuntimeException {
    private final String fieldValue;

    public DataNotFoundException(int code, String fieldValue) {
        super(String.format("%s - %s", code, fieldValue), code);
        this.fieldValue = fieldValue;
    }

    public String getFieldValue() {
        return this.fieldValue;
    }
}
