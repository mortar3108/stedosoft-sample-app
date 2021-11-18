package edu.gosho.samplespringapp.web;

import edu.gosho.samplespringapp.StaticVariables;
import edu.gosho.samplespringapp.domain.nomenklaturi.Region;
import edu.gosho.samplespringapp.domain.nomenklaturi.User;
import edu.gosho.samplespringapp.domain.nomenklaturi.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping(value = "/nomenklaturi")
public class NomenklaturiController {

    @GetMapping("artikuli")
    public void getItems() {
        StaticVariables.setArtikulsCount(100);
    }

    @PostMapping("artikuli")
    public ListArtikuli postItems() {
        var artikuli = new ListArtikuli();
        artikuli.artikuli =  new ArrayList<>(
                Arrays.asList(
                        new Artikul(10, "12121212", "airqn", 1),
                        new Artikul(11, "00451212", "airqn 500" ,2)
                )
        );
        for (int i=3; i<StaticVariables.artikulsCount; i++) {
            artikuli.artikuli.add(new Artikul(10, "12121212", "airqn", 1));
            //logika
        }
        return artikuli;
    }

    @GetMapping("merki")
    public void getMeasures() {
        StaticVariables.setMeasuresCount(100);
    }

    @PostMapping("merki")
    public ListMeasures postMeasures() {
        var measures = new ArrayList<Measure>();
        for (int i=0; i<StaticVariables.measuresCount; i++) {
            if (i%2==0) {
                measures.add(new Measure(i, "БР"));
            }
            else {
                measures.add(new Measure(i, "КГ"));
            }
        }
        return new ListMeasures(measures);
    }

    @GetMapping("kontragenti")
    public void getContractors() {
        StaticVariables.setContractorsCount(100);
    }

    @PostMapping("kontragenti")
    public ListContractors postContractors() {
        var contractors = new ArrayList<Contractor>();
        for (int i=0; i<StaticVariables.contractorsCount; i++) {
            contractors.add(new Contractor(i, "contractor" + i));
        }
        return new ListContractors(contractors);
    }

    @GetMapping("potrebiteli")
    public void getUsers() {
        StaticVariables.setUsersCount(100);
    }

    @PostMapping("potrebiteli")
    public ListUsers postUsers() {
        var users = new ArrayList<User>();
        for (int i=0; i<StaticVariables.usersCount; i++) {
            users.add(new User(i, "user" + i));
        }
        return new ListUsers(users);
    }

    @GetMapping("rajoni")
    public void getRegions() {
        StaticVariables.setRegionsCount(100);
    }

    @PostMapping("rajoni")
    public ListRegions postRegions() {
        var regions = new ArrayList<Region>();
        for (int i=0; i<StaticVariables.regionsCount; i++) {
            regions.add(new Region(i, "region" + i));
        }
        return new ListRegions(regions);
    }
}
