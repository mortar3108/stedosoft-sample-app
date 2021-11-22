package edu.gosho.samplespringapp.web;

import edu.gosho.samplespringapp.domain.common.DokumentRed;
import edu.gosho.samplespringapp.domain.common.ResponseType;
import edu.gosho.samplespringapp.domain.common.ServerResponse;
import edu.gosho.samplespringapp.domain.nomenklaturi.Artikul;
import edu.gosho.samplespringapp.domain.nomenklaturi.Kontragent;
import edu.gosho.samplespringapp.domain.nomenklaturi.Miarka;
import edu.gosho.samplespringapp.domain.priemanedostavchik.DokumentBlankaZaPriemOtDostavchik;
import edu.gosho.samplespringapp.domain.priemanedostavchik.ListDokumentBlankaZaPriemOtDostavchik;
import edu.gosho.samplespringapp.domain.priemanedostavchik.ProverkaIVzimaneNaBlanki;
import edu.gosho.samplespringapp.domain.priemanedostavchik.SingleDokumentBlankaZaPriemOtDostavchik;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RestController
@RequestMapping(value = "/priemane-dostavchik", produces = "application/json; charset=utf-8", consumes = "application/json; charset=utf-8")
public class PriemaneDostavchikController {


    @PostMapping("proverka-i-vzimane-na-blanki")
    public ListDokumentBlankaZaPriemOtDostavchik proverkaIVzimaneNaBlanki(@RequestBody ProverkaIVzimaneNaBlanki blanka) {
        var redove = new ArrayList<>(
                Arrays.asList(
                        new DokumentRed(6, new Miarka(1, "кг"), new Artikul(1, "barcode1", "name1", new Miarka(1, "кг"))),
                        new DokumentRed(1, new Miarka(2, "бр"), new Artikul(2, "barcode2", "name2", new Miarka(2, "бр"))),
                        new DokumentRed(12, new Miarka(3, "кг1"), new Artikul(3, "barcode3", "name3", new Miarka(3, "кг1")))
                ));
        var blanki = new ArrayList<>(
                Arrays.asList(
                        new DokumentBlankaZaPriemOtDostavchik(300, "n-1", new Date(), new Kontragent(10, "contractor1"), redove),
                        new DokumentBlankaZaPriemOtDostavchik(301, "n-2", new Date(), new Kontragent(10, "contractor1"), redove),
                        new DokumentBlankaZaPriemOtDostavchik(302, "n-3", new Date(), new Kontragent(11, "contractor2"), redove)
                )
        );
        return new ListDokumentBlankaZaPriemOtDostavchik(blanki);

    }

    @PutMapping("vryshtane-na-blanka")
    public ServerResponse vrushtaneNaBlanka(@RequestBody SingleDokumentBlankaZaPriemOtDostavchik blanka) {
        return new ServerResponse(ResponseType.SUCCESS,blanka);
    }


}
