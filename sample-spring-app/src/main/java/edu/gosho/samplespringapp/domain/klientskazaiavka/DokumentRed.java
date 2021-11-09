package edu.gosho.samplespringapp.domain.klientskazaiavka;

import edu.gosho.samplespringapp.domain.nomenklaturi.Artikul;
import edu.gosho.samplespringapp.domain.nomenklaturi.Measure;
import java.util.Date;

public class DokumentRed {
    private Artikul artikul;
    private String partidaIme;
    private Date partidaSrokNaGodnost;
    private double kolichestvo;
    private Measure miarka;

    public DokumentRed(String partidaIme, Date partidaSrokNaGodnost, double kolichestvo, Measure miarka, Artikul artikul) {
        this.partidaIme = partidaIme;
        this.partidaSrokNaGodnost = partidaSrokNaGodnost;
        this.kolichestvo = kolichestvo;
        this.miarka = miarka;
        this.artikul = artikul;
    }

    public String getPartidaIme() {
        return partidaIme;
    }

    public void setPartidaIme(String partidaIme) {
        this.partidaIme = partidaIme;
    }

    public Date getPartidaSrokNaGodnost() {
        return partidaSrokNaGodnost;
    }

    public void setPartidaSrokNaGodnost(Date partidaSrokNaGodnost) {
        this.partidaSrokNaGodnost = partidaSrokNaGodnost;
    }

    public double  getKolichestvo() {
        return kolichestvo;
    }

    public void setKolichestvo(double  kolichestvo) {
        this.kolichestvo = kolichestvo;
    }
}
