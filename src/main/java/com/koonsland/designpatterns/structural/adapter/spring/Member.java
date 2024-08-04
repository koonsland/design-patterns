package com.koonsland.designpatterns.structural.adapter.spring;

public class Member {
    private String email;
    private String password;

    protected Member() {
    }

    public Member(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
