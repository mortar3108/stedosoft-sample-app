package edu.gosho.samplespringapp;

import java.util.ArrayList;

public class Order {
    private int id;
    private int userId;
    private ArrayList<OrderItems> items;

    public Order(int id, int userId, ArrayList<OrderItems> items) {
        this.id = id;
        this.userId = userId;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<OrderItems> getItems() {
        return items;
    }

    public void setItems(ArrayList<OrderItems> items) {
        this.items = items;
    }
}
