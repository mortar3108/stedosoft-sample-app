package edu.gosho.samplespringapp.web;

import edu.gosho.samplespringapp.domain.common.DokumentRed;
import edu.gosho.samplespringapp.domain.common.ResponseType;
import edu.gosho.samplespringapp.domain.common.ServerResponse;
import edu.gosho.samplespringapp.domain.common.StaticVariables;
import edu.gosho.samplespringapp.domain.klientskazaiavka.DokumentBlankaZaPaketiraneNaStokaZaKlient;
import edu.gosho.samplespringapp.domain.klientskazaiavka.ListDokumentBlankaZaPaketiraneNaStokaZaKlient;
import edu.gosho.samplespringapp.domain.klientskazaiavka.ProverkaIVzimaneNaBlanki;
import edu.gosho.samplespringapp.domain.nomenklaturi.Artikul;
import edu.gosho.samplespringapp.domain.nomenklaturi.Kontragent;
import edu.gosho.samplespringapp.domain.nomenklaturi.Miarka;
import edu.gosho.samplespringapp.domain.nomenklaturi.Rajon;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RestController
@RequestMapping(value = "/paketirane-klientska-zaiavka")
public class PaketiraneKlientskaZaiavkaController {


    @PostMapping("proverka-i-vzimane-na-blanki")
    public ListDokumentBlankaZaPaketiraneNaStokaZaKlient proverkaIVzimaneNaBlanki(@RequestBody ProverkaIVzimaneNaBlanki proverkaIVzimaneNaBlanki) {
        var redove = new ArrayList<>(
                Arrays.asList(
                        new DokumentRed(11, new Miarka(1, "кг"), new Artikul(1, "barcode1", "name1", new Miarka(1, "кг"))),
                        new DokumentRed(12, new Miarka(2, "бр"), new Artikul(2, "barcode2", "name2", new Miarka(2, "бр"))),
                        new DokumentRed(5, new Miarka(3, "кг1"), new Artikul(3, "barcode3", "name3", new Miarka(3, "кг1")))
                ));

        var blanki = new ArrayList<DokumentBlankaZaPaketiraneNaStokaZaKlient>();
        for(int i = 0; i < StaticVariables.getPaketiraneCount(); i++ ){
            blanki.add(new DokumentBlankaZaPaketiraneNaStokaZaKlient(100 + i, "n-1" + i, new Date(), new Kontragent(10, "contractor1"), new Rajon(11, "test 11"), redove));
        }
        return new ListDokumentBlankaZaPaketiraneNaStokaZaKlient(blanki);
    }

    @PutMapping("vryshtane-na-blanka")
    public ServerResponse vrushtaneNaBlanka(@RequestBody DokumentBlankaZaPaketiraneNaStokaZaKlient blanka) {
        return new ServerResponse(ResponseType.SUCCESS,blanka);
    }

}
