package edu.gosho.samplespringapp.domain.nomenklaturi;

import java.util.ArrayList;

public class ListMiarka {

    ArrayList<Miarka> merki;

    public ListMiarka(ArrayList<Miarka> merki) {
        this.merki = merki;
    }

    public ArrayList<Miarka> getMerki() {
        return merki;
    }

    public void setMerki(ArrayList<Miarka> merki) {
        this.merki = merki;
    }
}
