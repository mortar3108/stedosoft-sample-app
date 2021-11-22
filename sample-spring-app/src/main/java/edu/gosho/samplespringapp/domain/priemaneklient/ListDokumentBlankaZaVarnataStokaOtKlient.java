package edu.gosho.samplespringapp.domain.priemaneklient;

import java.util.ArrayList;

public class ListDokumentBlankaZaVarnataStokaOtKlient {
    ArrayList<DokumentBlankaZaVarnataStokaOtKlient> blanki;

    public ListDokumentBlankaZaVarnataStokaOtKlient(ArrayList<DokumentBlankaZaVarnataStokaOtKlient> blanki) {
        this.blanki = blanki;
    }

    public ArrayList<DokumentBlankaZaVarnataStokaOtKlient> getBlanki() {
        return blanki;
    }

    public void setBlanki(ArrayList<DokumentBlankaZaVarnataStokaOtKlient> blanki) {
        this.blanki = blanki;
    }
}
