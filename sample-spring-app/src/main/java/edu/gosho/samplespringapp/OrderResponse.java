package edu.gosho.samplespringapp;

public class OrderResponse {
    private int proformaId;
    private String nomer;
    private String data;
    private int client;
    private int sdelkaId;
    private OrderResponseItems responseItems;

    public OrderResponse(int id, String number, String date, int client, int dealId, OrderResponseItems responseItems) {
        this.proformaId = id;
        this.nomer = number;
        this.data = date;
        this.client = client;
        this.sdelkaId = dealId;
        this.responseItems = responseItems;
    }

    public int getProformaId() {
        return proformaId;
    }

    public void setProformaId(int proformaId) {
        this.proformaId = proformaId;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public int getSdelkaId() {
        return sdelkaId;
    }

    public void setSdelkaId(int sdelkaId) {
        this.sdelkaId = sdelkaId;
    }

    public OrderResponseItems getResponseItems() {
        return responseItems;
    }

    public void setResponseItems(OrderResponseItems responseItems) {
        this.responseItems = responseItems;
    }
}
