package edu.gosho.samplespringapp.domain;

public class OrderItems {
    private int id;
    private String partida;
    private String srok;
    private int kol;
    private int mqrka;

    public OrderItems(int id, String partida, String srok, int kol, int mqrka) {
        this.id = id;
        this.partida = partida;
        this.srok = srok;
        this.kol = kol;
        this.mqrka = mqrka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getSrok() {
        return srok;
    }

    public void setSrok(String srok) {
        this.srok = srok;
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
