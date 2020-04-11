package com.poc.bdd.service;

import org.springframework.stereotype.Service;

@Service
public class UserInfo {
    private String username;
    private String pwd;

    public void setInfo(String username, String pwd){
        this.username = username;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
