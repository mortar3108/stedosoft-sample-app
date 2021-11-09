package edu.gosho.samplespringapp.web;

import edu.gosho.samplespringapp.domain.klientskazaiavka.DokumentBlanka;
import edu.gosho.samplespringapp.domain.klientskazaiavka.DokumentRed;
import edu.gosho.samplespringapp.domain.klientskazaiavka.BlankaProverka;
import edu.gosho.samplespringapp.domain.klientskazaiavka.ListBlanki;
import edu.gosho.samplespringapp.domain.nomenklaturi.Artikul;
import edu.gosho.samplespringapp.domain.nomenklaturi.Contractor;
import edu.gosho.samplespringapp.domain.nomenklaturi.Measure;
import edu.gosho.samplespringapp.domain.nomenklaturi.Region;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RestController
@RequestMapping(value = "/paketirane-klientska-zaiavka")
public class PaketiraneKlientskaZaiavkaController {


    @PostMapping("proverka-i-vzimane-na-blanki")
    public ListBlanki proverkaIVzimaneNaBlanki(@RequestBody BlankaProverka blankaProverka) {
       var redove =  new ArrayList<>(
               Arrays.asList(
                       new DokumentRed("part-1", new Date(), 10.1, new Measure(1, "кг"), new Artikul(1, "barcode1", "name1", new Measure(1, "кг"))),
                       new DokumentRed("part-2", new Date(), 11, new Measure(2, "бр"), new Artikul(2, "barcode2", "name2", new Measure(2, "бр"))),
                       new DokumentRed("part-3", new Date(), 1.2, new Measure(3, "кг1"), new Artikul(3, "barcode3", "name3", new Measure(3, "кг1")))
               ));
       var blanki =  new ArrayList<>(
                Arrays.asList(
                        new DokumentBlanka("n-1", new Date(), new Contractor(10, "contractor1"), new Region(11, "test 11"), redove),
                        new DokumentBlanka("n-2", new Date(), new Contractor(10, "contractor1"), new Region(10, "test 10"), redove),
                        new DokumentBlanka("n-3", new Date(), new Contractor(11, "contractor2"), new Region(11, "test 11"), redove)
                )
        );
       return  new ListBlanki(blanki);
    }
    @PutMapping("vryshtane-na-blanka")
    public void vrushtaneNaBlanka(@RequestBody ListBlanki dokumentRedove) {

    }

}
