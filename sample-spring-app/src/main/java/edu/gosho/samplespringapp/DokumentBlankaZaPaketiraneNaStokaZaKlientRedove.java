package edu.gosho.samplespringapp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class DokumentBlankaZaPaketiraneNaStokaZaKlientRedove {
    @PostMapping
    public ArrayList<DokumentRed> dokumentRedove(@RequestBody BlankaProverka blankaProverka) {
        return new ArrayList<>(
                Arrays.asList(
                        new DokumentRed("", "01.01.0001", -1),
                        new DokumentRed("", "01.01.0001", -1),
                        new DokumentRed("", "01.01.0001", -1)
                )
        );
    }
}
