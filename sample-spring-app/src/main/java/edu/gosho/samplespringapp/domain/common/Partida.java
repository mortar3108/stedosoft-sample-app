package edu.gosho.samplespringapp.domain.common;

import java.util.Date;

public class Partida {
    Long id;
    String ime;
    Date srokNaGodnost;

    public Partida(Long id, String ime, Date srokNaGodnost) {
        this.id = id;
        this.ime = ime;
        this.srokNaGodnost = srokNaGodnost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Date getSrokNaGodnost() {
        return srokNaGodnost;
    }

    public void setSrokNaGodnost(Date srokNaGodnost) {
        this.srokNaGodnost = srokNaGodnost;
    }
}
