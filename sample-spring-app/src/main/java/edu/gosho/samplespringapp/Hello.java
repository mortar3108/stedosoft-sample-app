package edu.gosho.samplespringapp;

public class Hello {
    public float id;
    public String barcode;
    public String name;

    public Hello() {

    }

    public Hello(float id, String barcode, String name) {
        this.id = id;
        this.barcode = barcode;
        this.name = name;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
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
