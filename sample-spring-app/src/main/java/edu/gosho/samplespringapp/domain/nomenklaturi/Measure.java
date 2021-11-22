package edu.gosho.samplespringapp.domain.nomenklaturi;

public class Measure {
    private int id;
    private String ime;

    public Measure(int id, String name) {
        this.id = id;
        this.ime = name;
        
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
