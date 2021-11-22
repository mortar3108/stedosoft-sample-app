package edu.gosho.samplespringapp.web;

import edu.gosho.samplespringapp.domain.common.DokumentRed;
import edu.gosho.samplespringapp.domain.common.ResponseType;
import edu.gosho.samplespringapp.domain.common.ServerResponse;
import edu.gosho.samplespringapp.domain.nomenklaturi.Artikul;
import edu.gosho.samplespringapp.domain.nomenklaturi.Kontragent;
import edu.gosho.samplespringapp.domain.nomenklaturi.Miarka;
import edu.gosho.samplespringapp.domain.nomenklaturi.Rajon;
import edu.gosho.samplespringapp.domain.priemanedostavchik.ProverkaIVzimaneNaBlanki;
import edu.gosho.samplespringapp.domain.priemaneklient.DokumentBlankaZaVarnataStokaOtKlient;
import edu.gosho.samplespringapp.domain.priemaneklient.ListDokumentBlankaZaVarnataStokaOtKlient;
import edu.gosho.samplespringapp.domain.priemaneklient.SingleDokumentBlankaZaVarnataStokaOtKlient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RestController
@RequestMapping(value = "/priemane-klient", produces = "application/json; charset=utf-8", consumes = "application/json; charset=utf-8")
public class PriemaneKlientController {


    @PostMapping("proverka-i-vzimane-na-blanki")
    public ListDokumentBlankaZaVarnataStokaOtKlient proverkaIVzimaneNaBlanki(@RequestBody ProverkaIVzimaneNaBlanki blanka) {
        var redove = new ArrayList<>(
                Arrays.asList(
                        new DokumentRed(1, new Miarka(1, "кг"), new Artikul(1, "barcode1", "name1", new Miarka(1, "кг"))),
                        new DokumentRed(2, new Miarka(2, "бр"), new Artikul(2, "barcode2", "name2", new Miarka(2, "бр"))),
                        new DokumentRed(3, new Miarka(3, "кг1"), new Artikul(3, "barcode3", "name3", new Miarka(3, "кг1")))
                ));
        var blanki = new ArrayList<>(
                Arrays.asList(
                        new DokumentBlankaZaVarnataStokaOtKlient(101, "n-1-1", new Date(), new Kontragent(10, "contractor1"), new Rajon(1, "1"), redove),
                        new DokumentBlankaZaVarnataStokaOtKlient(102, "n-2-1", new Date(), new Kontragent(10, "contractor1"), new Rajon(2, "2"), redove),
                        new DokumentBlankaZaVarnataStokaOtKlient(103, "n-3-1", new Date(), new Kontragent(11, "contractor2"), new Rajon(2, "2"), redove)
                )
        );
        return new ListDokumentBlankaZaVarnataStokaOtKlient(blanki);

    }

    @PutMapping("vryshtane-na-blanka")
    public ServerResponse vrushtaneNaBlanka(@RequestBody SingleDokumentBlankaZaVarnataStokaOtKlient blanka) {
        return new ServerResponse(ResponseType.ERROR,blanka);
    }


}
