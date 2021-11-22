package edu.gosho.samplespringapp.domain.revizia;

import edu.gosho.samplespringapp.domain.common.Dokument;
import edu.gosho.samplespringapp.domain.common.DokumentRed;

import java.util.ArrayList;
import java.util.Date;

public class DokumentObrazecZaRevizia extends Dokument {

    Date data;

    public DokumentObrazecZaRevizia() {
        super();
    }

    public DokumentObrazecZaRevizia(Date date, ArrayList<DokumentRed> redove) {
        super(redove);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
