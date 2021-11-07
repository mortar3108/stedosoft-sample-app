package edu.gosho.samplespringapp.domain.klientskazaiavka;

public class BlankaProverka {
    private String data;
    private int rajonId;

    public BlankaProverka(String data, int rajonId) {
        this.data = data;
        this.rajonId = rajonId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getRajonId() {
        return rajonId;
    }

    public void setRajonId(int rajonId) {
        this.rajonId = rajonId;
    }
}
