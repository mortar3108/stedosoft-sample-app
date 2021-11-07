package edu.gosho.samplespringapp.domain.klientskazaiavka;

import edu.gosho.samplespringapp.domain.nomenklaturi.Artikul;

import java.util.ArrayList;

public class ListBlanki {
    public ArrayList<DokumentBlanka> blanki;

    public ListBlanki(ArrayList<DokumentBlanka> blanki) {
        this.blanki = blanki;
    }

    public ArrayList<DokumentBlanka> getBlanki() {
        return blanki;
    }

    public void setBlanki(ArrayList<DokumentBlanka> blanki) {
        this.blanki = blanki;
    }
}
