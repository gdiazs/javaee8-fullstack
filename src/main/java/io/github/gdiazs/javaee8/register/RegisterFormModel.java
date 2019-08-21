package io.github.gdiazs.javaee8.register;

import javax.enterprise.inject.Model;

@Model
public class RegisterFormModel {

    private String username;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
