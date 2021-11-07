package edu.gosho.samplespringapp.web;

import edu.gosho.samplespringapp.domain.klientskazaiavka.DokumentBlanka;
import edu.gosho.samplespringapp.domain.klientskazaiavka.DokumentRed;
import edu.gosho.samplespringapp.domain.klientskazaiavka.BlankaProverka;
import edu.gosho.samplespringapp.domain.klientskazaiavka.ListBlanki;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RestController
@RequestMapping(value = "/paketirane-klientska-zaiavka")
public class PaketiraneKlientskaZaiavkaController {


    @PostMapping("proverka-i-vzimane-na-blanki")
    public ListBlanki proverkaIVzimaneNaBlanki(@RequestBody BlankaProverka blankaProverka) {
       var blanki =  new ArrayList<>(
                Arrays.asList(
                        new DokumentBlanka("n-1", new Date(), 10, 11),
                        new DokumentBlanka("n-2", new Date(), 11, 10),
                        new DokumentBlanka("n-3", new Date(), 10, 11)
                )
        );
       return  new ListBlanki(blanki);
    }
    @PutMapping("vryshtane-na-blanka")
    public void vrushtaneNaBlanka(@RequestBody ArrayList<DokumentRed> dokumentRedove) {

    }

}
