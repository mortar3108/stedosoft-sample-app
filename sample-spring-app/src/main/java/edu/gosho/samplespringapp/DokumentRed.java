package edu.gosho.samplespringapp;

public class DokumentRed {
    private String partidaIme;
    private String partidaSrokNaGodnost;
    private int kolichestvo;

    public DokumentRed(String partidaIme, String partidaSrokNaGodnost, int kolichestvo) {
        this.partidaIme = partidaIme;
        this.partidaSrokNaGodnost = partidaSrokNaGodnost;
        this.kolichestvo = kolichestvo;
    }

    public String getPartidaIme() {
        return partidaIme;
    }

    public void setPartidaIme(String partidaIme) {
        this.partidaIme = partidaIme;
    }

    public String getPartidaSrokNaGodnost() {
        return partidaSrokNaGodnost;
    }

    public void setPartidaSrokNaGodnost(String partidaSrokNaGodnost) {
        this.partidaSrokNaGodnost = partidaSrokNaGodnost;
    }

    public int getKolichestvo() {
        return kolichestvo;
    }

    public void setKolichestvo(int kolichestvo) {
        this.kolichestvo = kolichestvo;
    }
}
