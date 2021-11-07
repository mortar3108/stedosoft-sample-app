package edu.gosho.samplespringapp.web;

import edu.gosho.samplespringapp.domain.DokumentRed;
import edu.gosho.samplespringapp.domain.BlankaProverka;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class DokumentBlankaZaPaketiraneNaStokaZaKlientRedove {
    @PostMapping("/paketirane-klientska-zaiavka/proverka-i-vzimane-na-blanki")
    public ArrayList<DokumentRed> proverkaIVzimaneNaBlanki(@RequestBody BlankaProverka blankaProverka) {
        return new ArrayList<>(
                Arrays.asList(
                        new DokumentRed("", "01.01.0001", -1),
                        new DokumentRed("", "01.01.0001", -1),
                        new DokumentRed("", "01.01.0001", -1)
                )
        );
    }
    @PutMapping("/paketirane-klientska-zaiavka/vryshtane-na-blanka")
    public void vrushtaneNaBlanka(@RequestBody ArrayList<DokumentRed> dokumentRedove) {

    }

}
