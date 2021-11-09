package edu.gosho.samplespringapp.domain.klientskazaiavka;

import edu.gosho.samplespringapp.domain.nomenklaturi.Contractor;
import edu.gosho.samplespringapp.domain.nomenklaturi.Region;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.Date;

public class DokumentBlanka {

    String nomer;
    Date date;
    Contractor kontragent;
    Region rajon;
    ArrayList<DokumentRed> redove;

    public DokumentBlanka(String nomer, Date date, Contractor kontragent, Region rajon, ArrayList<DokumentRed> redove) {
        this.nomer = nomer;
        this.date = date;
        this.kontragent = kontragent;
        this.rajon = rajon;
        this.redove = redove;
    }

    public ArrayList<DokumentRed> getRedove() {
        return redove;
    }

    public void setRedove(ArrayList<DokumentRed> redove) {
        this.redove = redove;
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

    public Contractor getKontragent() {
        return kontragent;
    }

    public void setKontragent(Contractor kontragent) {
        this.kontragent = kontragent;
    }

    public Region getRajon() {
        return rajon;
    }

    public void setRajon(Region rajon) {
        this.rajon = rajon;
    }
}
