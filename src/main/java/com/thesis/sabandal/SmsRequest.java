package com.thesis.sabandal;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class SmsRequest {

    @NotBlank
    private final String phonenumber;

    @NotBlank
    private final String message;

    public SmsRequest(@JsonProperty("phonenumber") String phonenumber, @JsonProperty("message") String message) {
        this.phonenumber = phonenumber;
        this.message = message;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getMessage() {
        return message;
    }
}
