package edu.gosho.samplespringapp.domain.nomenklaturi;

import java.util.ArrayList;

public class ListUsers {

    public ListUsers(ArrayList<User> potrebiteli) {
        this.potrebiteli = potrebiteli;
    }

    public ArrayList<User> potrebiteli;

    public ArrayList<User> getPotrebiteli() {
        return potrebiteli;
    }

    public void setPotrebiteli(ArrayList<User> potrebiteli) {
        this.potrebiteli = potrebiteli;
    }
}
