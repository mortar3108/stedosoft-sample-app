package edu.gosho.samplespringapp.domain.klientskazaiavka;

public class SingleDokumentBlankaZaPaketiraneNaStokaZaKlient {
    DokumentBlankaZaPaketiraneNaStokaZaKlient blanka;

    public SingleDokumentBlankaZaPaketiraneNaStokaZaKlient(DokumentBlankaZaPaketiraneNaStokaZaKlient blanka) {
        this.blanka = blanka;
    }

    public DokumentBlankaZaPaketiraneNaStokaZaKlient getBlanka() {
        return blanka;
    }

    public void setBlanka(DokumentBlankaZaPaketiraneNaStokaZaKlient blanka) {
        this.blanka = blanka;
    }
}
