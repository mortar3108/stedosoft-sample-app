package edu.gosho.samplespringapp.domain.nomenklaturi;

public class Rajon {
    int id;
    String ime;

    public Rajon(int id, String ime) {
        this.id = id;
        this.ime = ime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
}
