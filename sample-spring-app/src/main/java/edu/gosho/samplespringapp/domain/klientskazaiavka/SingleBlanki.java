package edu.gosho.samplespringapp.domain.klientskazaiavka;

import java.util.ArrayList;

public class SingleBlanki {
    public DokumentBlanka blanka;

    public SingleBlanki(DokumentBlanka blanka) {
        this.blanka = blanka;
    }

    public DokumentBlanka getBlanka() {
        return blanka;
    }

    public void setBlanka(DokumentBlanka blanka) {
        this.blanka = blanka;
    }
}
