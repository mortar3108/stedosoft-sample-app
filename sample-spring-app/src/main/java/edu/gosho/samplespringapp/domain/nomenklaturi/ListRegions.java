package edu.gosho.samplespringapp.domain.nomenklaturi;

import java.util.ArrayList;

public class ListRegions {

    public ListRegions(ArrayList<Region> potrebiteli) {
        this.rajoni = rajoni;
    }

    public ArrayList<Region> rajoni;

    public ArrayList<Region> getRajoni() {
        return rajoni;
    }

    public void setRajoni(ArrayList<Region> rajoni) {
        this.rajoni = rajoni;
    }
}
