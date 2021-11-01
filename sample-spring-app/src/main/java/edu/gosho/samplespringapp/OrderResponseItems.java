package edu.gosho.samplespringapp;

public class OrderResponseItems {
    private int id;
    private int kol;
    private int mqrka;

    public OrderResponseItems(int id, int kol, int mqrka) {
        this.id = id;
        this.kol = kol;
        this.mqrka = mqrka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }

    public int getMqrka() {
        return mqrka;
    }

    public void setMqrka(int mqrka) {
        this.mqrka = mqrka;
    }
}
