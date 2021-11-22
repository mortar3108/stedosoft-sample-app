package edu.gosho.samplespringapp.domain.nomenklaturi;

import java.util.ArrayList;

public class ListPotrebitel {

    ArrayList<Potrebitel> potrebiteli;

    public ListPotrebitel(ArrayList<Potrebitel> potrebiteli) {
        this.potrebiteli = potrebiteli;
    }

    public ArrayList<Potrebitel> getPotrebiteli() {
        return potrebiteli;
    }

    public void setPotrebiteli(ArrayList<Potrebitel> potrebiteli) {
        this.potrebiteli = potrebiteli;
    }
}
