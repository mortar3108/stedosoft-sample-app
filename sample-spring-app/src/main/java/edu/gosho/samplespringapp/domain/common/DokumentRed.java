package edu.gosho.samplespringapp.domain.common;

import edu.gosho.samplespringapp.domain.nomenklaturi.Artikul;
import edu.gosho.samplespringapp.domain.nomenklaturi.Miarka;

public class DokumentRed {
    Artikul artikul;
    Partida partida;
    Double kolichestvoWms;
    Double kolichestvoKontiko;
    Miarka miarka;

    public DokumentRed(double kolichestvoKontiko, Miarka miarka, Artikul artikul) {
        this.partida = null;
        this.kolichestvoWms = null;
        this.kolichestvoKontiko = kolichestvoKontiko;
        this.miarka = miarka;
        this.artikul = artikul;
    }

    public Double getKolichestvoWms() {
        return kolichestvoWms;
    }

    public void setKolichestvoWms(Double kolichestvoWms) {
        this.kolichestvoWms = kolichestvoWms;
    }

    public Artikul getArtikul() {
        return artikul;
    }

    public void setArtikul(Artikul artikul) {
        this.artikul = artikul;
    }

    public Miarka getMiarka() {
        return miarka;
    }

    public void setMiarka(Miarka miarka) {
        this.miarka = miarka;
    }

    public Double getKolichestvoKontiko() {
        return kolichestvoKontiko;
    }

    public void setKolichestvoKontiko(Double kolichestvoKontiko) {
        this.kolichestvoKontiko = kolichestvoKontiko;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
}
