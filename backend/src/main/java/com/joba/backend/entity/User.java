package com.joba.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    //the user variables need to be changed, so that they are connected to a database
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String encryptedUsername;
    private String encryptedPassword;
    private String email;
    private String firstName;
    private String lastName;

    public Long getUserId() {
        return id;
    }

    public void setUserId(Long userId) {
        this.id = id;
    }

    public String getEncryptedUsername() {
        return username;
    }

    public void setEncryptedUsername(String username) {
        this.username = username;
    }

    public String getEncryptedPassword() {
        return password;
    }

    public void setEncrpytedPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}