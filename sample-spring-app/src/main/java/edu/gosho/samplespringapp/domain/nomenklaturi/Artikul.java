package edu.gosho.samplespringapp.domain.nomenklaturi;

public class Artikul {
    int id;
    String barcode;
    String ime;
    Miarka miarka;
    String nomerKatalog;


    public Artikul(int id, String barcode, String name, Miarka miarka) {
        this.id = id;
        this.barcode = barcode;
        this.ime = name;
        this.miarka = miarka;
        this.nomerKatalog = String.valueOf(1000 + id);
    }

    public Miarka getMiarka() {
        return miarka;
    }

    public void setMiarka(Miarka miarka) {
        this.miarka = miarka;
    }

    public String getNomerKatalog() {
        return nomerKatalog;
    }

    public void setNomerKatalog(String nomerKatalog) {
        this.nomerKatalog = nomerKatalog;
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
