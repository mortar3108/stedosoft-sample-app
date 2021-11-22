package edu.gosho.samplespringapp.domain.priemaneklient;

import edu.gosho.samplespringapp.domain.common.DokumentRed;
import edu.gosho.samplespringapp.domain.klientskazaiavka.DokumentBlankaZaPaketiraneNaStokaZaKlient;
import edu.gosho.samplespringapp.domain.nomenklaturi.Kontragent;
import edu.gosho.samplespringapp.domain.nomenklaturi.Rajon;

import java.util.ArrayList;
import java.util.Date;

public class DokumentBlankaZaVarnataStokaOtKlient extends DokumentBlankaZaPaketiraneNaStokaZaKlient {


    public DokumentBlankaZaVarnataStokaOtKlient(int id, String nomer, Date data, Kontragent kontragent, Rajon rajon, ArrayList<DokumentRed> redove) {
        super(id, nomer, data, kontragent, rajon, redove);
    }
}
