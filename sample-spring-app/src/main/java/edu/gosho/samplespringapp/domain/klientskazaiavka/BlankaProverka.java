package edu.gosho.samplespringapp.domain.klientskazaiavka;

import edu.gosho.samplespringapp.domain.nomenklaturi.Region;

public class BlankaProverka {
    private String data;
    private Region rajon;

    public BlankaProverka(String data, Region rajonId) {
        this.data = data;
        this.rajon = rajonId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Region getRajon() {
        return rajon;
    }

    public void setRajon(Region rajonId) {
        this.rajon = rajonId;
    }
}
