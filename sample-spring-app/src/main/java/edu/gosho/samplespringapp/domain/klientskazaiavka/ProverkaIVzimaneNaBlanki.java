package edu.gosho.samplespringapp.domain.klientskazaiavka;

import edu.gosho.samplespringapp.domain.nomenklaturi.Rajon;

public class ProverkaIVzimaneNaBlanki {
    String data;
    Rajon rajon;

    public ProverkaIVzimaneNaBlanki() {

    }

    public ProverkaIVzimaneNaBlanki(String data, Rajon rajonId) {
        this.data = data;
        this.rajon = rajonId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Rajon getRajon() {
        return rajon;
    }

    public void setRajon(Rajon rajonId) {
        this.rajon = rajonId;
    }
}
