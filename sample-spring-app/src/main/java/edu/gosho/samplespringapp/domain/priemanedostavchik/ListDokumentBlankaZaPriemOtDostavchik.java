package edu.gosho.samplespringapp.domain.priemanedostavchik;

import java.util.ArrayList;

public class ListDokumentBlankaZaPriemOtDostavchik {
    ArrayList<DokumentBlankaZaPriemOtDostavchik> blanki;

    public ListDokumentBlankaZaPriemOtDostavchik(ArrayList<DokumentBlankaZaPriemOtDostavchik> blanki) {
        this.blanki = blanki;
    }

    public ArrayList<DokumentBlankaZaPriemOtDostavchik> getBlanki() {
        return blanki;
    }

    public void setBlanki(ArrayList<DokumentBlankaZaPriemOtDostavchik> blanki) {
        this.blanki = blanki;
    }
}
