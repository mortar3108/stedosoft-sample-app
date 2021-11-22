package edu.gosho.samplespringapp.domain.nomenklaturi;

import java.util.ArrayList;

public class ListKontragent {
    ArrayList<Kontragent> kontragenti;

    public ListKontragent(ArrayList<Kontragent> kontragenti) {
        this.kontragenti = kontragenti;
    }

    public ArrayList<Kontragent> getKontragenti() {
        return kontragenti;
    }

    public void setKontragenti(ArrayList<Kontragent> kontragenti) {
        this.kontragenti = kontragenti;
    }
}
