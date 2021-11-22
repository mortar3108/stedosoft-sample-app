package edu.gosho.samplespringapp.domain.priemanedostavchik;

public class SingleDokumentBlankaZaPriemOtDostavchik {
    DokumentBlankaZaPriemOtDostavchik blanka;

    public SingleDokumentBlankaZaPriemOtDostavchik() {

    }

    public SingleDokumentBlankaZaPriemOtDostavchik(DokumentBlankaZaPriemOtDostavchik blanka) {
        this.blanka = blanka;
    }

    public DokumentBlankaZaPriemOtDostavchik getBlanka() {
        return blanka;
    }

    public void setBlanka(DokumentBlankaZaPriemOtDostavchik blanka) {
        this.blanka = blanka;
    }
}
