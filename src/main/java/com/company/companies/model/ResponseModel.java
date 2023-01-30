package com.company.companies.model;

import org.springframework.stereotype.Component;

@Component
public class ResponseModel {

    private String message;

    public String getMassege() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
