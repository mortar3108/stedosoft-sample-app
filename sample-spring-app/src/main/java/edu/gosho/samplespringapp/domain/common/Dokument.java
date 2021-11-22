package edu.gosho.samplespringapp.domain.common;

import java.util.ArrayList;

public abstract class Dokument {

    ArrayList<DokumentRed> redove;

    public Dokument() {

    }

    public Dokument(ArrayList<DokumentRed> redove) {
        this.redove = redove;
    }

    public ArrayList<DokumentRed> getRedove() {
        return redove;
    }

    public void setRedove(ArrayList<DokumentRed> redove) {
        this.redove = redove;
    }
}
