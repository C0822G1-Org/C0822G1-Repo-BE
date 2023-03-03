package com.c0822g1primaryschoolbe.dto.request;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SignInForm {
    @Size(min = 3,max = 10)
    @Pattern(regexp = "[\\w]+")
    private String username;
    @Size(min = 3,max = 10)
    @Pattern(regexp = "[\\w]+")
    private String password;

    public SignInForm() {
    }

    public SignInForm(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
