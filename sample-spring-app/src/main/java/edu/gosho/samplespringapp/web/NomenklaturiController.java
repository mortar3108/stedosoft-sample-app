package edu.gosho.samplespringapp.web;

import edu.gosho.samplespringapp.domain.nomenklaturi.Region;
import edu.gosho.samplespringapp.domain.nomenklaturi.User;
import edu.gosho.samplespringapp.domain.nomenklaturi.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping(value = "/nomenklaturi")
public class NomenklaturiController {

    @PostMapping("artikuli")
    public ListArtikuli getItems() {
        var artikuli = new ListArtikuli();
        artikuli.artikuli =  new ArrayList<>(
                Arrays.asList(
                        new Artikul(10, "12121212", "airqn", 1),
                        new Artikul(11, "00451212", "airqn 500" ,2)
                ));
        return artikuli;
    }


    @PostMapping("merki")
    public ListMeasures getMeasures() {
        var measures = new ArrayList<>(
                Arrays.asList(
                        new Measure(1, "КГ"),
                        new Measure(2, "БР")
                )
        );
        return new ListMeasures( measures);
    }

    @PostMapping("kontragenti")
    public ListContractors getContragenti() {

        var  contractors = new ArrayList<>(
                Arrays.asList(
                        new Contractor(10, "contractor1"),
                        new Contractor(11, "contractor2")
                )
        );
        return new ListContractors(contractors);
    }

    @PostMapping("potrebiteli")
    public ListUsers getUsers() {
        var users = new ArrayList<>(
                Arrays.asList(
                        new User(10, "user1"),
                        new User(11, "user2")
                )
        );
        return new ListUsers(users);
    }


    @PostMapping("rajoni")
    public ListRegions getRegions() {

        var regions = new ArrayList<>(
                Arrays.asList(
                        new Region(10, "region1"),
                        new Region(11, "region2")
                )
        );
        return new ListRegions(regions);
    }
}
