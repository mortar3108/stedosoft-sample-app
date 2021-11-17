package edu.gosho.samplespringapp.domain.nomenklaturi;

public class Artikul {
    private int id;
    private String barcode;
    private String ime;
    private int miarkaId;

    public int getMiarkaId() {
        return miarkaId;
    }

    public void setMiarkaId(int miarkaId) {
        this.miarkaId = miarkaId;
    }

    public Artikul(int id, String barcode, String name, int miarkaId) {
        this.id = id;
        this.barcode = barcode;
        this.ime = name;
        this.miarkaId = miarkaId;
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
