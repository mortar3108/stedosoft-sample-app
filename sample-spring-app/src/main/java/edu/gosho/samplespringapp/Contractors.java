package edu.gosho.samplespringapp;

public class Contractors {
    public float id;
    public String name;

    public Contractors(float id, String name) {
        this.id = id;
        this.name = name;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}