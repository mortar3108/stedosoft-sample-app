package edu.gosho.samplespringapp.domain.priemanedostavchik;

import edu.gosho.samplespringapp.domain.common.Dokument;
import edu.gosho.samplespringapp.domain.common.DokumentRed;
import edu.gosho.samplespringapp.domain.nomenklaturi.Kontragent;

import java.util.ArrayList;
import java.util.Date;

public class DokumentBlankaZaPriemOtDostavchik extends Dokument {
    int id;
    String nomer;
    Date data;
    Kontragent kontragent;

    public DokumentBlankaZaPriemOtDostavchik(int id, String nomer, Date data, Kontragent kontragent, ArrayList<DokumentRed> redove) {
        super(redove);
        this.nomer = nomer;
        this.data = data;
        this.kontragent = kontragent;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Kontragent getKontragent() {
        return kontragent;
    }

    public void setKontragent(Kontragent kontragent) {
        this.kontragent = kontragent;
    }
}
