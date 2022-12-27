package com.example.mvvmappdemo.model;

public class UserJava {
    String userEmail = null;
    String userPassword = null;

    public UserJava(String email, String password){
        this.userEmail = email;
        this.userPassword = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
