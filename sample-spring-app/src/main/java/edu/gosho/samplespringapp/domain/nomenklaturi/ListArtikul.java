package edu.gosho.samplespringapp.domain.nomenklaturi;

import java.util.ArrayList;

public class ListArtikul {
    ArrayList<Artikul> artikuli;

    public ListArtikul(ArrayList<Artikul> artikuli) {
        this.artikuli = artikuli;
    }

    public ArrayList<Artikul> getArtikuli() {
        return artikuli;
    }

    public void setArtikuli(ArrayList<Artikul> artikuli) {
        this.artikuli = artikuli;
    }
}
