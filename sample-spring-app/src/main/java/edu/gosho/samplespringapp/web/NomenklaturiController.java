package edu.gosho.samplespringapp.web;

import edu.gosho.samplespringapp.domain.common.StaticVariables;
import edu.gosho.samplespringapp.domain.nomenklaturi.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping(value = "/nomenklaturi", produces = "application/json; charset=utf-8", consumes = "application/json; charset=utf-8")
public class NomenklaturiController {

    @PostMapping("artikuli")
    public ListArtikul getItems() {
        var artikuli = new ArrayList<Artikul>();
        for (int i = 0; i< StaticVariables.artikulsCount; i++) {
            artikuli.add( new Artikul(i, "1212" + i, "airqn " + i, new Miarka(1, "кг")));
            //logika
        }
        return new ListArtikul(artikuli);
    }


    @PostMapping("merki")
    public ListMiarka getMeasures() {
        var measures = new ArrayList<>(
                Arrays.asList(
                        new Miarka(1, "КГ"),
                        new Miarka(2, "БР")
                )
        );
        return new ListMiarka(measures);
    }

    @PostMapping("kontragenti")
    public ListKontragent getContragenti() {

        var contractors = new ArrayList<>(
                Arrays.asList(
                        new Kontragent(10, "contractor1"),
                        new Kontragent(11, "contractor2")
                )
        );
        return new ListKontragent(contractors);
    }

    @PostMapping("potrebiteli")
    public ListPotrebitel getUsers() {
        var users = new ArrayList<>(
                Arrays.asList(
                        new Potrebitel(10, "user1"),
                        new Potrebitel(11, "user2")
                )
        );
        return new ListPotrebitel(users);
    }


    @PostMapping("rajoni")
    public ListRajon getRegions() {

        var regions = new ArrayList<>(
                Arrays.asList(
                        new Rajon(10, "region1"),
                        new Rajon(11, "region2")
                )
        );
        return new ListRajon(regions);
    }
}
