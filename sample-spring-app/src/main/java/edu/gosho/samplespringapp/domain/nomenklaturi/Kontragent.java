package edu.gosho.samplespringapp.domain.nomenklaturi;

public class Kontragent {
    int id;
    String ime;
    String nomer;

    public Kontragent(int id, String name) {
        this.id = id;
        this.ime = name;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
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
