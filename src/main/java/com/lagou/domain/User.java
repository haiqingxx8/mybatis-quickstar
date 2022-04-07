package com.lagou.domain;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private long id;
    private String username;
    private List<Order> orders;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", orders=" + orders +
                '}';
    }
}
