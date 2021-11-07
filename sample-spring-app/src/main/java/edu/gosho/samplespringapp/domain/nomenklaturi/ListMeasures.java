package edu.gosho.samplespringapp.domain.nomenklaturi;

import java.util.ArrayList;

public class ListMeasures {

    public ListMeasures(ArrayList<Measure> merki) {
        this.merki = merki;
    }

    public ArrayList<Measure> merki;

    public ArrayList<Measure> getMerki() {
        return merki;
    }

    public void setMerki(ArrayList<Measure> merki) {
        this.merki = merki;
    }
}
