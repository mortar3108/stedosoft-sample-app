package edu.gosho.samplespringapp.domain.klientskazaiavka;

import java.util.ArrayList;

public class ListDokumentBlankaZaPaketiraneNaStokaZaKlient {
    ArrayList<DokumentBlankaZaPaketiraneNaStokaZaKlient> blanki;

    public ListDokumentBlankaZaPaketiraneNaStokaZaKlient(ArrayList<DokumentBlankaZaPaketiraneNaStokaZaKlient> blanki) {
        this.blanki = blanki;
    }

    public ArrayList<DokumentBlankaZaPaketiraneNaStokaZaKlient> getBlanki() {
        return blanki;
    }

    public void setBlanki(ArrayList<DokumentBlankaZaPaketiraneNaStokaZaKlient> blanki) {
        this.blanki = blanki;
    }
}
