package fr.wcs.introSpring.controllers;

import lombok.Data;

public class ErrorMesage {
    private String message;

    public ErrorMesage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
