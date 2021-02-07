package com.tywh.test.struts2.controller;

public class LoginController {

    private String username;

    private String password;

    public String execute() {
        if ("admin".equals(username) && "admin".equals(password)) {
            return "success";
        }

        return "error";
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
