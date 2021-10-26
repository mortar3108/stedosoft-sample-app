package edu.gosho.samplespringapp;

public class Items {
    public int id;
    public String barcode;
    public String name;

    public Items(int id, String barcode, String name) {
        this.id = id;
        this.barcode = barcode;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
