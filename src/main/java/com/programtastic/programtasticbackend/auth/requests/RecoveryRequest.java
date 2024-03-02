package com.programtastic.programtasticbackend.auth.requests;

public class RecoveryRequest {
    private String email;

    public RecoveryRequest(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}