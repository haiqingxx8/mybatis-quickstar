package com.lagou.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private int id;
    private Date ordertime;
    private double total;
    private User user;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordertime=" + ordertime +
                ", total=" + total +
                ", user=" + user +
                '}';
    }
}
