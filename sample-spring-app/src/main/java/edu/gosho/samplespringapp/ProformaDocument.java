package edu.gosho.samplespringapp;

import java.util.ArrayList;

public class ProformaDocument {
    private int id;
    private int userId;
    private ArrayList<ProformaDocumentItems> proformaDocumentItems;

    public ProformaDocument(int id, int userId, ArrayList<ProformaDocumentItems> proformaDocumentItems) {
        this.id = id;
        this.userId = userId;
        this.proformaDocumentItems = proformaDocumentItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<ProformaDocumentItems> getProformaDocumentItems() {
        return proformaDocumentItems;
    }

    public void setProformaDocumentItems(ArrayList<ProformaDocumentItems> proformaDocumentItems) {
        this.proformaDocumentItems = proformaDocumentItems;
    }
}
