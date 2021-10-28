package edu.gosho.samplespringapp;

public class OrderResponse {
    private int id;
    private String number;
    private String date;
    private int client;
    private int dealId;
    private SelectedResponseItems responseItems;

    public OrderResponse(int id, String number, String date, int client, int dealId, SelectedResponseItems responseItems) {
        this.id = id;
        this.number = number;
        this.date = date;
        this.client = client;
        this.dealId = dealId;
        this.responseItems = responseItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public int getDealId() {
        return dealId;
    }

    public void setDealId(int dealId) {
        this.dealId = dealId;
    }

    public SelectedResponseItems getResponseItems() {
        return responseItems;
    }

    public void setResponseItems(SelectedResponseItems responseItems) {
        this.responseItems = responseItems;
    }
}
