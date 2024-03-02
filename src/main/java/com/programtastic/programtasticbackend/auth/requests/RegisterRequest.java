package com.programtastic.programtasticbackend.auth.requests;

public class RegisterRequest {
    private String fName, lName;
    private String username;
    private String email;
    private String passwordHash;

    public RegisterRequest(String fName, String lName, String username, String email, String passwordHash) {
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return passwordHash;
    }

    public void setPassword(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}