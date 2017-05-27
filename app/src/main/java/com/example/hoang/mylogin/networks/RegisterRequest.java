package com.example.hoang.mylogin.networks;

/**
 * Created by Hoang on 5/27/2017.
 */

public class RegisterRequest {
    private String username;
    private String password;

    public RegisterRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
