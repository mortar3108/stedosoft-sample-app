package edu.gosho.samplespringapp.domain.klientskazaiavka;

import java.util.Date;

public class DokumentBlanka {

    String nomer;
    Date date;
    int kontragent;
    int rajon;

    public DokumentBlanka(String nomer, Date date, int kontragent, int rajon) {
        this.nomer = nomer;
        this.date = date;
        this.kontragent = kontragent;
        this.rajon = rajon;
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

    public int getKontragent() {
        return kontragent;
    }

    public void setKontragent(int kontragent) {
        this.kontragent = kontragent;
    }

    public int getRajon() {
        return rajon;
    }

    public void setRajon(int rajon) {
        this.rajon = rajon;
    }
}
