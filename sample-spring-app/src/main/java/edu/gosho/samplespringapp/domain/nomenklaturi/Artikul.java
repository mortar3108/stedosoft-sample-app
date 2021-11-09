package edu.gosho.samplespringapp.domain.nomenklaturi;

public class Artikul {
    public int id;
    public String barcode;
    public String ime;
    public Measure miarka;

    public Measure getMiarka() {
        return miarka;
    }

    public void setMiarkaId(Measure miarka) {
        this.miarka = miarka;
    }

    public Artikul(int id, String barcode, String name, Measure miarka) {
        this.id = id;
        this.barcode = barcode;
        this.ime = name;
        this.miarka = miarka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
}
