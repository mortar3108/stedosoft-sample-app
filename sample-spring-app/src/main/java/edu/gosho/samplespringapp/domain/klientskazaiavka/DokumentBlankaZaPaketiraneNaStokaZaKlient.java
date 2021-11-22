package edu.gosho.samplespringapp.domain.klientskazaiavka;

import edu.gosho.samplespringapp.domain.common.Dokument;
import edu.gosho.samplespringapp.domain.common.DokumentRed;
import edu.gosho.samplespringapp.domain.nomenklaturi.Kontragent;
import edu.gosho.samplespringapp.domain.nomenklaturi.Rajon;

import java.util.ArrayList;
import java.util.Date;

public class DokumentBlankaZaPaketiraneNaStokaZaKlient extends Dokument {
    int id;
    String nomer;
    Date date;
    Kontragent kontragent;
    Rajon rajon;
    String address = "";
    String magazinIme = "";


    public DokumentBlankaZaPaketiraneNaStokaZaKlient(int id, String nomer, Date date, Kontragent kontragent, Rajon rajon, ArrayList<DokumentRed> redove) {
        super(redove);
        this.nomer = nomer;
        this.date = date;
        this.kontragent = kontragent;
        this.rajon = rajon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMagazinIme() {
        return magazinIme;
    }

    public void setMagazinIme(String magazinIme) {
        this.magazinIme = magazinIme;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Kontragent getKontragent() {
        return kontragent;
    }

    public void setKontragent(Kontragent kontragent) {
        this.kontragent = kontragent;
    }

    public Rajon getRajon() {
        return rajon;
    }

    public void setRajon(Rajon rajon) {
        this.rajon = rajon;
    }
}
