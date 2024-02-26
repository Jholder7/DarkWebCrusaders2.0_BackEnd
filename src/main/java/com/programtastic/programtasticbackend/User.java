package com.programtastic.programtasticbackend;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;
    @Column(nullable = false)
    private String userName,
            fName,
            lName,
            email,
            passwordHash,
            countryLastSignIn;
    private LocalDate dateAccountCreated, dateLastSignIn;

    public User() {
    }

    public User(String userName,
                String fName,
                String lName,
                String email,
                String passwordHash,
                String countryLastSignIn,
                LocalDate dateAccountCreated,
                LocalDate dateLastSignIn) {
        this.userName = userName;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.countryLastSignIn = countryLastSignIn;
        this.dateAccountCreated = dateAccountCreated;
        this.dateLastSignIn = dateLastSignIn;
    }

    public User(long userID,
                String userName,
                String fName,
                String lName,
                String email,
                String passwordHash,
                String countryLastSignIn,
                LocalDate dateAccountCreated,
                LocalDate dateLastSignIn) {
        this.userID = userID;
        this.userName = userName;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.countryLastSignIn = countryLastSignIn;
        this.dateAccountCreated = dateAccountCreated;
        this.dateLastSignIn = dateLastSignIn;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getCountryLastSignIn() {
        return countryLastSignIn;
    }

    public void setCountryLastSignIn(String countryLastSignIn) {
        this.countryLastSignIn = countryLastSignIn;
    }

    public LocalDate getDateAccountCreated() {
        return dateAccountCreated;
    }

    public void setDateAccountCreated(LocalDate dateAccountCreated) {
        this.dateAccountCreated = dateAccountCreated;
    }

    public LocalDate getDateLastSignIn() {
        return dateLastSignIn;
    }

    public void setDateLastSignIn(LocalDate dateLastSignIn) {
        this.dateLastSignIn = dateLastSignIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", countryLastSignIn='" + countryLastSignIn + '\'' +
                ", dateAccountCreated=" + dateAccountCreated +
                ", dateLastSignIn=" + dateLastSignIn +
                '}';
    }
}
