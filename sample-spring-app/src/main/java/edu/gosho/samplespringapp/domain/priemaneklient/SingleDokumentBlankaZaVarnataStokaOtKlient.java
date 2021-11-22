package edu.gosho.samplespringapp.domain.priemaneklient;

public class SingleDokumentBlankaZaVarnataStokaOtKlient {
    DokumentBlankaZaVarnataStokaOtKlient blanka;

    public SingleDokumentBlankaZaVarnataStokaOtKlient() {

    }

    public SingleDokumentBlankaZaVarnataStokaOtKlient(DokumentBlankaZaVarnataStokaOtKlient blanka) {
        this.blanka = blanka;
    }

    public DokumentBlankaZaVarnataStokaOtKlient getBlanka() {
        return blanka;
    }

    public void setBlanka(DokumentBlankaZaVarnataStokaOtKlient blanka) {
        this.blanka = blanka;
    }
}
